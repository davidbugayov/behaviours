package com.davidbugaev.samplebehavior

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchStdAppBarScrollsActivity(button: View) {
        val newIntent = Intent(this, StdAppBarScrollActivity::class.java)
        startActivity(newIntent)
    }

    fun launchStdAppBarStaysActivity(button: View) {
        val newIntent = Intent(this, StdAppBarStaysActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarTabsScrollsActivity(button: View) {
        val newIntent = Intent(this, AppBarWithTabsScrollsActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarTabStaysActivity(button: View) {
        val newIntent = Intent(this, AppBarWithTabsStaysActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarTabHidesActivity(button: View) {
        val newIntent = Intent(this, AppBarWithToolBarAndTabStaysActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarFlexiSpaceScrollsActivity(button: View) {
        val newIntent = Intent(this, AppBarFlexiSpaceScrollsActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarFlexiImageScrollsActivity(button: View) {
        val newIntent = Intent(this, AppBarFlexiImageScrollsActivity::class.java)
        startActivity(newIntent)
    }

    fun launchAppBarFlexiOverlappingActivity(button: View) {
        val newIntent = Intent(this, AppBarFlexiOverlappingActivity::class.java)
        startActivity(newIntent)
    }
}
