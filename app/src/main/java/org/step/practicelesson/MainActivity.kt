package org.step.practicelesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var button_share: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    private fun initializeViews() {
        button_share = findViewById(R.id.button_activity_main_share)
    }

    fun initializeListeners() {
        button_share?.setOnClickListener{
            val sendIntent = Intent(this, ResultActivity::class.java)
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Жакупова"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

    }
}