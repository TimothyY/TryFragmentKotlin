package com.example.tryfragment

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class UpperFragment: Fragment(R.layout.upper_fragment) {

    private lateinit var tvResult:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvResult = view.findViewById<EditText>(R.id.tvResult)
    }

    fun updateMyResult(message: String) {
        tvResult.text = message
    }

}