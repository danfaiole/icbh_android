package fms.android.icbh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fms.android.icbh.R
import fms.android.icbh.Utilities.MenuNavigation
import kotlinx.android.synthetic.main.activity_main.*

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        navigation.setOnNavigationItemSelectedListener(MenuNavigation.loadMenu())
    }
}
