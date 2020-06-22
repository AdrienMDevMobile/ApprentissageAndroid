package com.example.myapplication

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.ui.main.MainFragment


/* Premier fragment et première activité : pour tester la définition de fragment en dur,
mettre un ClickListener sur le fragment et faire un intent pour passer d'une activité à une autre. */
class MainActivity : AppCompatActivity()  {
    //MainFragment.onMvmtClickListener

    companion object{
        const val MESSAGE_SECOND_ACTIVITE = "Message.second.activite"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        } */
    }
    /*
    override fun onNextActivityClick(name1: String) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(MESSAGE_SECOND_ACTIVITE, name1)
        startActivity(intent)
    }
    */

}
