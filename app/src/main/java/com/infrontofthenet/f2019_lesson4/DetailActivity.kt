package com.infrontofthenet.f2019_lesson4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // read url from Extra object and display in textview
        val extras = intent.extras // get the full list of extras
        val url = extras!!.getString("url")
        textViewUrl.setText(url);

        // use implicit intent to load uri in default browser
        buttonVisit.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW)

            // pass the uri to the intent
            i.data = Uri.parse(url)

            // invoke the intent
            startActivity(i)
        }

        // close activity (automatically reactivates Main Activity from top of the back stack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}
