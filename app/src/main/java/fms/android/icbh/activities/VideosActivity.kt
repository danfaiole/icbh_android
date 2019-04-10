package fms.android.icbh.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import fms.android.icbh.R
import fms.android.icbh.utilities.MenuNavigation
import kotlinx.android.synthetic.main.activity_main.*

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)
        Log.d("ON CREATE", "NOVA VÍDEO ACTIVITY")
        menu_navigation.setOnNavigationItemSelectedListener(MenuNavigation.loadMenu(this))
    }
}
