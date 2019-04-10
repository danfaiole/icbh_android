package fms.android.icbh.utilities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import fms.android.icbh.R
import fms.android.icbh.activities.MainActivity
import fms.android.icbh.activities.VideosActivity

object MenuNavigation {
    fun loadMenu(context: Context) : BottomNavigationView.OnNavigationItemSelectedListener {
        return BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
//                    Log.d("NOME DA CLASSE JAVA", context.javaClass.simpleName)
                    val mainActivityIntent : Intent = Intent(context, MainActivity::class.java)
                    goToActivity(context, mainActivityIntent, null, "MainActivity")

                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_schedule -> {
                    println("Menu navigation schedule clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_videos -> {
                    val videosActivityIntent : Intent = Intent(context, VideosActivity::class.java)
                    goToActivity(context, videosActivityIntent, null, "VideosActivity")

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

    private fun goToActivity(context : Context, intent : Intent, options : Bundle?, className : String) {
        if (context.javaClass.simpleName != className) {
            startActivity(context, intent, options)
        }
    }
}