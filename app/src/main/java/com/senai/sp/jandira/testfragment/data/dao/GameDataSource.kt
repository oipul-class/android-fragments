package com.senai.sp.jandira.testfragment.data.dao

import android.content.Context
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Console
import com.senai.sp.jandira.testfragment.model.Game

class GameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game> {

            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é...",
                4.5,
                listOf(Console
                    (1, "PlayStation 1", "sony", "1994-12-3")
                )))

            games.add(Game(
                1,
                "Minecraft",
                context.getDrawable(R.drawable.mortal)!!,
                "Em Minecraft, os jogadores exploram um mundo aberto tridimensional intencionalmente em blocos, pixelizado e gerado proceduralmente, podendo descobrir e extrair matérias-primas, ferramentas artesanais, construir estruturas ou terraplanagens e, dependendo do modo de jogo, podem combater inimigos controlados por computador, bem como cooperar ou competir contra outros jogadores no mesmo mundo.",
                4.0,
                listOf(
                    Console(2, "XBOX 360", "Microsoft", "2005-10-22"),
                    Console(3, "Switch", "Nintendo", "2017-3-3"),
                    Console(4, "PlayStation 4", "Nintendo", "2013-10-15")
                )
            ))

            return games
        }

    }


}