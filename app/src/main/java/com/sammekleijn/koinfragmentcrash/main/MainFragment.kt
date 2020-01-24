package com.sammekleijn.koinfragmentcrash.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sammekleijn.koinfragmentcrash.R
import com.sammekleijn.koinfragmentcrash.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment(private val title: String) : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title_text_view.text = title

        go_to_next_activity_button.setOnClickListener {
            startActivity(Intent(requireContext(), DetailActivity::class.java))
        }
    }
}