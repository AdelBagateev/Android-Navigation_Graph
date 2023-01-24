package com.example.navigation_graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigation_graph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(R.id.homeFragment, R.id.likesFragment, R.id.searchFragment, R.id.navigateFragment2, R.id.profileFragment  ),
            fallbackOnNavigateUpListener = ::onSupportNavigateUp
        )

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        val controller =
            (supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment).
                navController

        findViewById<Toolbar>(androidx.appcompat.R.id.action_bar)
            .setupWithNavController(controller, appBarConfiguration)

        binding?.run {
            bnvMain.setupWithNavController(controller)
        }
    }
}