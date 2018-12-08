package com.devfest.devfestandroidespresso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener {
            val homeIntent = Intent(this, HomeActivity::class.java)
            homeIntent.putExtra(HomeActivity.EXTRA_USERNAME, etUsername.text.toString())
            startActivity(homeIntent)
        }
    }
}
