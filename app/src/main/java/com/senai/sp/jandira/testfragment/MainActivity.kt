package com.senai.sp.jandira.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.senai.sp.jandira.testfragment.fragments.ConsolesFragment
import com.senai.sp.jandira.testfragment.fragments.GamesFragment
import com.senai.sp.jandira.testfragment.fragments.HomeFragment
//View.OnClickListener, no main
class MainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener,
    NavigationView.OnNavigationItemSelectedListener{
//    antiga variaveis de botões do menu de cima
//    private lateinit var buttonHome : Button
//    private lateinit var buttonConsoles : Button
//    private lateinit var buttonGames : Button
    private lateinit var bottomNavigation : BottomNavigationView
    private lateinit var navigationView: NavigationView

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout

    private lateinit var homeFragment: HomeFragment
    private lateinit var consolesFragment: ConsolesFragment
    private lateinit var gamesFragment: GamesFragment


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.drawer_navigation_layout)
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

        navigationView = findViewById(R.id.drawerNavigationView)
        navigationView.setNavigationItemSelectedListener(this)

        drawer = findViewById(R.id.drawer)

        toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Home"

        var toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        homeFragment = HomeFragment()
        consolesFragment = ConsolesFragment()
        gamesFragment = GamesFragment()
        //linha de comando para colocar o fragmento da home no frameLayout
       setFragment(homeFragment)

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
                toolbar.title = "Home"
                setFragment(homeFragment)
            }

            R.id.menu_console -> {
                toolbar.title = "Console"
               setFragment(consolesFragment)
            }

            R.id.menu_games -> {
                toolbar.title = "Games"
                setFragment(gamesFragment)
            }
        }

        // *** Selecionar o item de menu no BottomNavigationView ***
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.isChecked = true

        // *** fechar o drawer se estuver aberto ***
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }

    fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame , fragment)
            .commit()
    }
}