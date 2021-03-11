package com.senai.sp.jandira.testfragment.data.dao

import android.content.Context
import com.senai.sp.jandira.testfragment.model.Console

class ConsoleDataSource {

    companion object {

        fun listarTodos(context: Context) : List<Console> {
            val consoleDao = DatabaseBuilder.getDatabase(context).consoleDao()



            return consoleDao.listarTodosConsoles()
        }



    }

}