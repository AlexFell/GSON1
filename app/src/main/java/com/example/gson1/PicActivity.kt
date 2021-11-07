package com.example.gson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)

        val pic = intent.getStringExtra("Photo")
        val imageView = findViewById<View>(R.id.img) as ImageView

        Glide.with(this).load(pic).into(imageView)

        val actionBar = supportActionBar
        actionBar!!.title = "Photo"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.icon, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_one){
            Toast.makeText(this, "Избранное", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}