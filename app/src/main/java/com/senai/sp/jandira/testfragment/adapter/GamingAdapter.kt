package com.senai.sp.jandira.testfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.holder.GameViewHolder
import com.senai.sp.jandira.testfragment.model.Game

class GamingAdapter: RecyclerView.Adapter<GameViewHolder>() {

    private var gameList = listOf<Game>()

    fun updateGameList(list: List<Game>) {
        gameList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
       val view = LayoutInflater
           .from(parent.context)
           .inflate(R.layout.holder_game_layout, parent, false)

        return GameViewHolder(view)
    }

    override fun getItemCount(): Int { //retorno da quantidade de itens na lista
        return gameList.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(gameList[position])
    }
}