package com.example.hp.miprimerlayout

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.RippleDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgResId = R.drawable.singapore
        var resId = imgResId

        var colorValue = ContextCompat.getColor(this, R.color.blanco)
        var colorId = colorValue

        upload.setOnClickListener{
            if (resId == R.drawable.singapore)
                resId = R.drawable.madidi
            else
                resId = R.drawable.singapore

            foto.setImageResource(resId)

            //foto.setBackgroundResource(R.drawable.madidi)
        }

        fondo.setOnClickListener{

            if (colorId == colorValue) {
                colorValue = ContextCompat.getColor(this, R.color.plomo)
                scroll.setBackgroundColor(colorValue)
            }else
            {
                colorValue = ContextCompat.getColor(this, R.color.blanco)
                scroll.setBackgroundColor(colorValue)
            }
        }
    }
}
