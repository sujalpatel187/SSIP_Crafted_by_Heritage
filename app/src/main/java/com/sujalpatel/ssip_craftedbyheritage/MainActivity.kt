package com.sujalpatel.ssip_craftedbyheritage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search:EditText = findViewById(R.id.editText)
        val search_btn : MaterialButton = findViewById(R.id.search_material_btn)
        val buy_btn_1 : MaterialButton = findViewById(R.id.btn_bye_1)
        val text_1 : TextView = findViewById(R.id.ammount_1)
        val image_1:ImageView = findViewById(R.id.enroll)

        image_1.setOnClickListener { Intent(this,Enroll_Activity::class.java).also { startActivity(it) } }

        buy_btn_1.setOnClickListener {
            Intent(this,CartActivity::class.java).also {
                intent.putExtra("m",text_1.text.toString())
                startActivity(it) }
        }

        search_btn.setOnClickListener {
            when(search.text.toString()){
                "pot" ->{
                    Intent(this,Port_Activity::class.java).also { startActivity(it) }
                }
                "shopping bag" ->{
                    Intent(this,SHoppingBagActivity::class.java).also { startActivity(it) }
                }
                "decoration" ->{
                    Intent(this,Decoration_Activity::class.java).also { startActivity(it) }
                }
                "earings" ->{
                    Intent(this,Earings_Activity::class.java).also { startActivity(it) }
                }
                "yawn" ->{
                    Intent(this,Yawn_Activity::class.java).also { startActivity(it) }
                }
                "braclet" ->{
                    Intent(this,Braclet_Activity::class.java).also { startActivity(it) }
                }
                "nackless" ->{
                    Intent(this,Nackless_Activity::class.java).also { startActivity(it) }
                }
            }
        }




        val pf_btn:ImageView = findViewById(R.id.profile_img)
        pf_btn.setOnClickListener {
            Intent(this,LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        val port:ImageView = findViewById(R.id.icon_1)
        port.setOnClickListener {
            Intent(this,Port_Activity::class.java).also {
                startActivity(it)
            }
        }

        val shopping_bag:ImageView = findViewById(R.id.icon_2)
        shopping_bag.setOnClickListener {
            Intent(this,SHoppingBagActivity::class.java).also {
                startActivity(it)
            }
        }

        val decoration:ImageView = findViewById(R.id.icon_3)
        decoration.setOnClickListener {
            Intent(this,Decoration_Activity::class.java).also {
                startActivity(it)
            }
        }

        val earings:ImageView = findViewById(R.id.icon_4)
        earings.setOnClickListener {
            Intent(this,Earings_Activity::class.java).also {
                startActivity(it)
            }
        }

        val yawn:ImageView = findViewById(R.id.icon_5)
        yawn.setOnClickListener {
            Intent(this,Yawn_Activity::class.java).also {
                startActivity(it)
            }
        }

        val braslet:ImageView = findViewById(R.id.icon_6)
        braslet.setOnClickListener {
            Intent(this,Braclet_Activity::class.java).also {
                startActivity(it)
            }
        }

        val nackless:ImageView = findViewById(R.id.icon_7)
        nackless.setOnClickListener {
            Intent(this,Nackless_Activity::class.java).also {
                startActivity(it)
            }
        }



    }
}