package com.senai.sp.jandira.testfragment.fragments

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Console
import com.senai.sp.jandira.testfragment.adapter.ConsoleAdapter
import com.senai.sp.jandira.testfragment.data.dao.ConsoleDataSource
import com.senai.sp.jandira.testfragment.data.dao.DatabaseBuilder

class ConsolesFragment : Fragment(), View.OnClickListener {

    private lateinit var recyclerConsoles : RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()
    private lateinit var addConsole : ImageButton
    private lateinit var dialog: AlertDialog
    private lateinit var buttonCancelar: Button
    private lateinit var buttonSalvar: Button

    private lateinit var editNome: EditText
    private lateinit var editFabricante: EditText
    private lateinit var editDataLancamento: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_consoles, container, false)

        recyclerConsoles = view.findViewById(R.id.recycler_view_consoles)

        recyclerConsoles.layoutManager = GridLayoutManager(view.context, 2)

        recyclerConsoles.adapter = consoleAdapter

        consoleList = ConsoleDataSource.listarTodos(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addConsole = view.findViewById(R.id.addConsole)
        addConsole.setOnClickListener(this)
    }

    fun exibirTelaDeInsercao() {
        val alertDialog = AlertDialog.Builder(view!!.context)

        val inflater = layoutInflater

        val view = inflater.inflate(R.layout.inserir_console_dialog, null)

        alertDialog.setView(view)

        editNome = view.findViewById(R.id.edit_nome)
        editFabricante = view.findViewById(R.id.edit_fabricante)
        editDataLancamento = view.findViewById(R.id.edit_data_lancamento)


        buttonSalvar = view.findViewById(R.id.button_salvar)
        buttonSalvar.setOnClickListener(this)

        buttonCancelar = view.findViewById(R.id.button_cancelar)
        buttonCancelar.setOnClickListener(this)

        dialog = alertDialog.create()
        dialog.setCancelable(false)
        dialog.show()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.addConsole -> {
                exibirTelaDeInsercao()
            }

            R.id.button_cancelar -> {
                dialog.dismiss()
            }

            R.id.button_salvar -> {
                val contatoDao = DatabaseBuilder.getDatabase(view!!.context).consoleDao()

                var console = Console(consoleName = editNome.text.toString(), consoleImage = "", consoleMaker = editFabricante.text.toString(), consoleReleaseDate = editDataLancamento.text.toString())

                contatoDao.salvarConsole(console)

                Toast.makeText(view!!.context, "salvo", Toast.LENGTH_SHORT).show()

                dialog.dismiss()
            }

        }

    }

}