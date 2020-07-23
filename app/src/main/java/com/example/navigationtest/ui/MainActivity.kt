package com.example.navigationtest.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.example.navigationtest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.navigationHostFragment)

        setupToolbar()
        setupDrawer()
        setupBottomNavigation()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)

        // up-or-burger-icon
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.DrawerTestDest,
                R.id.OverflowTestDest,
                R.id.DestinationTestDest,
                R.id.CodeListFragmentDest
            ),
            drawerLayout
        )

        toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    private fun setupDrawer() {
        drawerNavigationView.setupWithNavController(navController)
    }

    private fun setupBottomNavigation() {
        bottomNavigationView.setupWithNavController(navController)
        //navController.addOnDestinationChangedListener(/* do sth */)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // menu-item == destination ? navigate : do default
        return item.onNavDestinationSelected(navController)
                || super.onOptionsItemSelected(item)
    }
}
