package com.example.p30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_home_form.*

class HomeForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_form)
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

    }
