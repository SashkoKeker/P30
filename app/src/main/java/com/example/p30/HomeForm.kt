package com.example.p30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.ToggleButton
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_home_form.*

class HomeForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_form)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val About = Intent(this, About::class.java)

        when(item?.itemId) {
            R.id.action_about -> startActivity(About)
            R.id.share -> {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                val Sharebody = "Body"
                val Sharesub = "sub"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, Sharebody)
                shareIntent.putExtra(Intent.EXTRA_TEXT, Sharesub)
                startActivity(Intent.createChooser(shareIntent, "qwe"))
                }

            }

        return super.onOptionsItemSelected(item)
    }


    fun Check(view: View) {
        val checked: Boolean = switch2.isChecked
        if (checked) {
                switch2.isChecked = false

            } else {
                switch2.isChecked = true
            }
        if (checkBox.isChecked) {
            checkBox.isChecked = false

        } else {
            checkBox.isChecked = true
        }


        if (radioButton.isChecked) {
            radioButton2.isChecked = true
        }else if (radioButton2.isChecked) {
            radioButton.isChecked = true
        }

        if (toggleButton.isChecked) {
            toggleButton.isChecked = false

        } else {
            toggleButton.isChecked = true
        }
    }

    fun fragment(view: View) {
        val F = Intent(this, MainActivity2::class.java)

        startActivity(F)
    }
}
