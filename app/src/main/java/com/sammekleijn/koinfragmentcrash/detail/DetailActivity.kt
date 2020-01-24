package com.sammekleijn.koinfragmentcrash.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sammekleijn.koinfragmentcrash.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity(R.layout.activity_detail) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        go_back_button.setOnClickListener {
            finish()
        }
    }
}