package com.sujalpatel.ssip_craftedbyheritage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

         val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
            Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show()
        }
    }
}