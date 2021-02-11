package com.senai.sp.jandira.testfragment.data.dao

import android.content.Context
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Console

class ConsoleDataSource {
    companion object {
        fun getConsoles(context: Context) : ArrayList<Console> {
            var consoles = ArrayList<Console>()

            consoles.add(Console(
                1,
                "Play Station 4",
                context.getDrawable(R.drawable.ps4)!!,
                "Sony",
                "2013-11-15"
            ))

            consoles.add(
                Console(
                    2,
                    "XBOX 360",
                    context.getDrawable(R.drawable.xbox_360)!!,
                    "Microsoft",
                    "2005-10-22"
            ))

            consoles.add(
                Console(
                    3,
                    "Switch",
                    context.getDrawable(R.drawable.nintendo_switch)!!,
                    "Nintendo",
                    "2017-3-3"
            ))

            consoles.add(
                Console(
                    4,
                    "SNES Classic Edition",
                    context.getDrawable(R.drawable.snes_classic)!!,
                    "Nintendo",
                    "2017-9-17"
                ))


            return consoles
        }
    }

}