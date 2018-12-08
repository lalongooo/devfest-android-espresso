package com.devfest.devfestandroidespresso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val userName = intent.getStringExtra(EXTRA_USERNAME)
        tvHomeUsername.text = userName
    }

    companion object {
        val EXTRA_USERNAME = "extra_username"
    }
}