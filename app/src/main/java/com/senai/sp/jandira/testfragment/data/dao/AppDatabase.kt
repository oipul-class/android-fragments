package com.senai.sp.jandira.testfragment.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.senai.sp.jandira.testfragment.model.Console

@Database(entities =  [Console::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun consoleDao(): consoleDao
}