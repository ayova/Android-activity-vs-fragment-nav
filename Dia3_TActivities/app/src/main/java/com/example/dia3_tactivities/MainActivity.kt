package com.example.dia3_tactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toProfile.setOnClickListener {
            var intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("text", et_text.text.toString())
            startActivity(intent)
        }
    }
}
