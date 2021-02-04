package com.senai.sp.jandira.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.adapter.GamingAdapter
import com.senai.sp.jandira.testfragment.data.dao.GameDataSource
import com.senai.sp.jandira.testfragment.model.Game


class GamesFragment : Fragment() {

    private lateinit var recyclerGames: RecyclerView
    private val gameAdapter = GamingAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //tornar o menu visivel
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        //Instancia a RecyclerView
        recyclerGames = view.findViewById(R.id.recycler_view_games)

        //Determinar a orientação
        recyclerGames.layoutManager = LinearLayoutManager(view.context)

        //Informar para a recyclerView qual é o adapter que ela ira usar
        recyclerGames.adapter = gameAdapter

        //Dizer ao adapter qual é a fonte de dados
        gameList = GameDataSource.getGames(view.context)

        //Atualizar a lista de jogos do adpter
        gameAdapter.updateGameList(gameList)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_game, menu)
    }

}