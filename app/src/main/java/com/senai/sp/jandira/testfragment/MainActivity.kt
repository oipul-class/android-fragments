package com.senai.sp.jandira.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.senai.sp.jandira.testfragment.fragments.ConsolesFragment
import com.senai.sp.jandira.testfragment.fragments.GamesFragment
import com.senai.sp.jandira.testfragment.fragments.HomeFragment
//View.OnClickListener, no main
class MainActivity : AppCompatActivity(),  BottomNavigationView.OnNavigationItemSelectedListener {
//    antiga variaveis
//    private lateinit var buttonHome : Button
//    private lateinit var buttonConsoles : Button
//    private lateinit var buttonGames : Button
    private lateinit var bottomNavigation : BottomNavigationView

    private lateinit var homeFragment: HomeFragment
    private lateinit var consolesFragment: ConsolesFragment
    private lateinit var gamesFragment: GamesFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        buttonHome = findViewById(R.id.button_home)
//        buttonHome.setOnClickListener(this)
//
//        buttonConsoles = findViewById(R.id.button_consoles)
//        buttonConsoles.setOnClickListener(this)
//
//        buttonGames = findViewById(R.id.button_games)
//        buttonGames.setOnClickListener(this)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)


        homeFragment = HomeFragment()
        consolesFragment = ConsolesFragment()
        gamesFragment = GamesFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame , homeFragment)
            .commit()

    }
//  antigo comando do menu de cima
//    override fun onClick(v: View) {
//        when (v.id) {
//
//            R.id.button_home -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame , homeFragment)
//                    .commit()
//            }
//
//            R.id.button_consoles -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame , consolesFragment)
//                    .commit()
//            }
//
//            R.id.button_games -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame , gamesFragment)
//                    .commit()
//            }
//
//        }
//    }

    //para navegação do menu
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.menu_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame , homeFragment)
                    .commit()
            }

            R.id.menu_console -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame , consolesFragment)
                    .commit()
            }

            R.id.menu_games -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame , gamesFragment)
                    .commit()
            }


        }

        return true
    }
}