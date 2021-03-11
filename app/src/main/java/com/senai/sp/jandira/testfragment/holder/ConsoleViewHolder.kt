package com.senai.sp.jandira.testfragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Console

class ConsoleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val consoleName = itemView.findViewById<TextView>(R.id.console_name)
    val consoleReleaseDate = itemView.findViewById<TextView>(R.id.console_release_date)
    val consoleMaker = itemView.findViewById<TextView>(R.id.console_maker)

    fun bind(console: Console) {
        consoleName.text =  console.consoleName
        consoleReleaseDate.text = console.consoleReleaseDate
        consoleMaker.text = console.consoleMaker

    }


}