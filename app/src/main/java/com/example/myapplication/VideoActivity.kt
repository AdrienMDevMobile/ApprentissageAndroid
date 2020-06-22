package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.ui.second.VideoFragment

//Non utilisée. Je garde la classe pour montrer le travail qui avait été fait.
annotation class Deprecated
class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_activity)
        if (savedInstanceState == null) {
            //val myIntent = intent // gets the previously created intent
            /*val firstKeyName =
                myIntent.getStringExtra(MainActivity.MESSAGE_SECOND_ACTIVITE) // will return "FirstKeyValue"
            */

            /*supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment.newInstance(firstKeyName))
                .commitNow() */
        }
    }
}