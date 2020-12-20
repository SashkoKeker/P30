package com.example.p30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import timber.log.Timber

const val KEY_TIMER_SECONDS = "timer_seconds_key"



class MainActivity : AppCompatActivity() {
    private lateinit var timer: Timer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        setContentView(R.layout.activity_main)

        timer = Timer(lifecycle)

        if (savedInstanceState != null) {

            timer.secondsCount = savedInstanceState.getInt(KEY_TIMER_SECONDS, 0)

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_TIMER_SECONDS, timer.secondsCount)
        Timber.i("onSaveInstanceState Called")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Timber.i("onRestoreInstanceState Called")
    }



        fun login(view: View) {
            val IntentLog = Intent(this, HomeForm::class.java)

            startActivity(IntentLog)
        }

        fun singUp(view: View) {
            val IntentSing = Intent(this, SingUp::class.java)

            startActivity(IntentSing)
        }

        override fun onStart() {
            super.onStart()
            Timber.i("onStart Called")
        }

        override fun onResume() {
            super.onResume()
            Timber.i("onResume Called")
        }

        override fun onPause() {
            super.onPause()
            Timber.i("onPause Called")
        }

        override fun onStop() {
            super.onStop()
            Timber.i("onStop Called")
        }

        override fun onDestroy() {
            super.onDestroy()

            Timber.i("onDestroy Called. z = " + timer.secondsCount.toDouble() / timer.secondsCount1.toDouble() * 100)

        }

        override fun onRestart() {
            super.onRestart()
            Timber.i("onRestart Called")
        }
    }
