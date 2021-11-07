package com.example.gson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)

        val pic = intent.getStringExtra("Photo")
        val imageView = findViewById<View>(R.id.img) as ImageView

        Glide.with(this).load(pic).into(imageView)
    }
}