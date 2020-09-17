package com.teamSquirrel.tribalsimulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Start add product activity when click button
        buttonMainStart.setOnClickListener {
            startActivity(Intent(this, startTribeActivity::class.java))
        }


    }
}