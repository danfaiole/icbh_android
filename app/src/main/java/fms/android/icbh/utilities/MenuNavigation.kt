package fms.android.icbh.utilities

import android.support.design.widget.BottomNavigationView
import fms.android.icbh.R

object MenuNavigation {
    fun loadMenu() : BottomNavigationView.OnNavigationItemSelectedListener {
        return BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    println("Menu navigation home clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_schedule -> {
                    println("Menu navigation schedule clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_videos -> {
                    println("Menu navigation videos clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_downloads -> {
                    println("Menu navigation videos clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_more -> {
                    println("Menu navigation videos clicked")
                    return@OnNavigationItemSelectedListener true
                }
                else -> {
                    return@OnNavigationItemSelectedListener false
                }
            }
        }
    }
}