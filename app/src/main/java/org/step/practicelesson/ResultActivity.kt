package org.step.practicelesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    var result_textview: TextView? = null
    var shared_text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val bundle: Bundle? = intent.extras
        shared_text = bundle?.getString(Intent.EXTRA_TEXT)
        initializeViews()
    }

    private fun initializeViews() {
        result_textview = findViewById(R.id.textview_activity_result_shared)
        result_textview?.text = shared_text
    }
}