package com.senai.sp.jandira.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Console
import com.senai.sp.jandira.testfragment.adapter.ConsoleAdapter
import com.senai.sp.jandira.testfragment.data.dao.ConsoleDataSource

class ConsolesFragment : Fragment() {

    private lateinit var recyclerConsoles : RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()

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

        consoleList = ConsoleDataSource.getConsoles(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        return view
    }

}