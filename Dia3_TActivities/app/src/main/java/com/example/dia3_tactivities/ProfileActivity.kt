package com.example.dia3_tactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bundle = intent.extras
        val textPassed = bundle?.getString("text").toString()

        tv_received_text.text = textPassed

        btn_toHome.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("title", textPassed)
            startActivity(intent)
        }

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Profile activity"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if (id == android.R.id.home) {
            this.finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
