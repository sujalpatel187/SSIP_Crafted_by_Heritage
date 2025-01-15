package com.sujalpatel.ssip_craftedbyheritage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Enroll_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enroll)

        val btn : Button = findViewById(R.id.register_btn)

        btn.setOnClickListener { Intent(this,MainActivity::class.java).also { startActivity(it) }
            Toast.makeText(this, "Enrollment Done ", Toast.LENGTH_SHORT).show()}
    }
}