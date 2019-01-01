package com.example.bitamirshafiee.introductionlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_one.setOnClickListener {

            StyleableToast.makeText(this,"Hello my Toast", Toast.LENGTH_SHORT, R.style.mytoast).show()

        }


    }
}
