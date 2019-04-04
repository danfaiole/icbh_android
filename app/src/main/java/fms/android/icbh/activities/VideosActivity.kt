package fms.android.icbh.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fms.android.icbh.R
import fms.android.icbh.utilities.MenuNavigation
import kotlinx.android.synthetic.main.activity_main.*

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        menu_navigation.setOnNavigationItemSelectedListener(MenuNavigation.loadMenu())
    }
}
