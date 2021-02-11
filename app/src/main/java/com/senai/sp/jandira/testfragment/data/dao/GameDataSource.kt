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
                4.5f,
                listOf(Console
                    (1, "PlayStation 1", context.getDrawable(R.drawable.ps4)!!, "sony", "1994-12-3")
                )))

            games.add(Game(
                2,
                "Minecraft",
                context.getDrawable(R.drawable.minecraft)!!,
                "Em Minecraft, os jogadores exploram um mundo aberto tridimensional intencionalmente em blocos, pixelizado e gerado proceduralmente, podendo descobrir e extrair matérias-primas, ferramentas artesanais, construir estruturas ou terraplanagens e, dependendo do modo de jogo, podem combater inimigos controlados por computador, bem como cooperar ou competir contra outros jogadores no mesmo mundo.",
                2.0f,
                listOf(
                    Console(2, "XBOX 360", context.getDrawable(R.drawable.xbox_360)!!, "Microsoft", "2005-10-22"),
                    Console(3, "Switch", context.getDrawable(R.drawable.nintendo_switch)!!, "Nintendo", "2017-3-3"),
                    Console(4, "PlayStation 4", context.getDrawable(R.drawable.ps4)!!, "Nintendo", "2013-10-15")
                )
            ))

            games.add(Game(
                3,
                "Call of Duty",
                context.getDrawable(R.drawable.call_of_duty)!!,
                "Call of Duty é um jogo eletrônico de tiro em primeira pessoa idealizado em 1999, sendo o primeiro lançamento da franquia Call of Duty, lançado em 29 de outubro de 2003 para Microsoft Windows.    ",
                3.9f,
                listOf(
                    Console(2, "XBOX 360", context.getDrawable(R.drawable.xbox_360)!!, "Microsoft", "2005-10-22"),
                    Console(3, "Switch", context.getDrawable(R.drawable.nintendo_switch)!!, "Nintendo", "2017-3-3"),
                    Console(4, "PlayStation 4", context.getDrawable(R.drawable.ps4)!!,"Nintendo", "2013-10-15")
                )
            ))

            games.add(Game(
                4,
                "Half Life 2",
                context.getDrawable(R.drawable.half_life_2)!!,
                "Half-Life 2 (estilizado como HλLF-LIFE2) é um jogo de tiro em primeira pessoa, lançado em 2004 pela Valve Corporation. Trazendo diversas inovações para o campo dos games, Half-Life 2 logo se tornou um enorme sucesso de vendas e de crítica, ganhando vários prêmios importantes e sendo inclusive amplamente aclamado como o 'Jogo do Ano' e, posteriormente, como o 'Jogo da Década'.",
                3.9f,
                listOf(
                    Console(2, "XBOX 360", context.getDrawable(R.drawable.xbox_360)!!, "Microsoft", "2005-10-22"),
                    Console(3, "Switch", context.getDrawable(R.drawable.nintendo_switch)!!, "Nintendo", "2017-3-3"),
                    Console(4, "PlayStation 4", context.getDrawable(R.drawable.ps4)!!, "Nintendo", "2013-10-15")
                )
            ))

            return games
        }

    }


}