package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.channels.CompletionHandler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clientId: String = "YOUR_CLIENT_ID"
        val clientSecret: String = "YOUR_CLIENT_SECRET"
        val redirectUri: String = "https://webexdemoapp.com"

        continueNextButton.setOnClickListener{
            val email= email.text



        }


    }
}