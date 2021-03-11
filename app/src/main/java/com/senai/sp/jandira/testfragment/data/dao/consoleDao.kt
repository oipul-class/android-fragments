package com.senai.sp.jandira.testfragment.data.dao

import androidx.room.*
import com.senai.sp.jandira.testfragment.model.Console

@Dao
interface consoleDao {

    @Query("SELECT * FROM console ORDER BY id DESC")
    fun listarTodosConsoles() : List<Console>

    @Query("SELECT * FROM console WHERE id = :id")
    fun buscarPorIdCosnole(id: Int): Console

    @Insert
    fun salvarConsole(console: Console)

    @Update
    fun atualizarConsole(console: Console)

    @Delete
    fun deletarConsole(console: Console)

}