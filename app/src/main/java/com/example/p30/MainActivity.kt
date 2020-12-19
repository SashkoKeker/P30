package com.example.p30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        val IntentLog = Intent(this, HomeForm::class.java)

        startActivity(IntentLog)
    }
    fun singUp(view: View) {
        val IntentSing = Intent(this, SingUp::class.java)

        startActivity(IntentSing)
    }

}