package com.davidbugaev.samplebehavior

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class AppBarFlexiImageScrollsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appbar_flexible_image_scrolls)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val ab = supportActionBar
        ab!!.setDisplayHomeAsUpEnabled(true)
    }
}