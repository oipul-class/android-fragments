package com.senai.sp.jandira.testfragment.data.dao

import android.content.Context
import androidx.room.Room

class DatabaseBuilder {

    companion object {
        fun getDatabase(context: Context) : AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "db_games").allowMainThreadQueries().build()
        }

    }

}