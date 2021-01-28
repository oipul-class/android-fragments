package com.senai.sp.jandira.testfragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.senai.sp.jandira.testfragment.R
import com.senai.sp.jandira.testfragment.model.Game

class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageGame = itemView.findViewById<ImageView>(R.id.image_game)
    val textGameName = itemView.findViewById<TextView>(R.id.text_view_name_game)
    val chipGroupConsoles = itemView.findViewById<ChipGroup>(R.id.chip_group_consoles)
    val textGameDescription = itemView.findViewById<TextView>(R.id.text_view_description_game)
    val ratingBarGame = itemView.findViewById<RatingBar>(R.id.rating_bar_game)

    fun bind(game: Game) {
        imageGame.setImageDrawable(game.gameImage)
        textGameName.text = game.gameName

        for (console in game.consoles) {
            val chip = Chip(
                ContextThemeWrapper(itemView.context,
                R.style.ChipTextApparence),
                null,
                0)

            chip.text = console.consoleName
            chipGroupConsoles.addView(chip)

        }



        textGameDescription.text  = game.gameDescription
        ratingBarGame.rating = game.gameRating
    }
}