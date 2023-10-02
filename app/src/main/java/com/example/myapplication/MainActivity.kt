package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        val navBottomView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        setupWithNavController(navBottomView,navController)

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homeFragment -> {
                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.favouriteFragment -> {
                    val fragment = FavouriteFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.accountFragment -> {
                    val fragment = AccountFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}