package com.infrontofthenet.f2019_lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use explicit intent to load Detail Activity
        buttonNext.setOnClickListener {
            // create new intent object with the uri of our Detail Activity
            val i = Intent(applicationContext, DetailActivity::class.java)

            // use the Extra class to pass data to the intent
            i.putExtra("url", editTextUrl.text.toString())
            startActivity(i)
        }
    }
}
