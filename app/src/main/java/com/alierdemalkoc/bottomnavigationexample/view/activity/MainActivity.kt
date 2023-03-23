package com.alierdemalkoc.bottomnavigationexample.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.alierdemalkoc.bottomnavigationexample.R
import com.alierdemalkoc.bottomnavigationexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.fragmentContainerView
        ) as NavHostFragment
        navController = navHostFragment.navController

        // Sets up BottomNavigationView for use with a NavController.
        val bottomNavigationView = binding.bottomNav
        bottomNavigationView.setupWithNavController(navController)

        // Sets up the ActionBar for use with a navController and destinations
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment, R.id.favFragment,  R.id.profileFragment)
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
        // Allows NavigationUI to support proper up navigation or the drawer layout
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
}