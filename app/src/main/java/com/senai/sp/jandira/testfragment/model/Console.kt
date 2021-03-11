package com.senai.sp.jandira.testfragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console (
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "name") var consoleName: String,
    @ColumnInfo(name = "image") var consoleImage: String,
    @ColumnInfo(name = "maker") var consoleMaker: String,
    @ColumnInfo(name = "release_date") var consoleReleaseDate: String
)