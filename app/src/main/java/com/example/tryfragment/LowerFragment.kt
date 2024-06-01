package com.example.tryfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class LowerFragment: Fragment(R.layout.lower_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etInput = view.findViewById<EditText>(R.id.etInput)

        val btnCmToInch = view.findViewById<Button>(R.id.btnCmToInch)
        btnCmToInch.setOnClickListener {
            val strUserInput = etInput.text.toString()
            (activity as MainActivityButtonClickListener).onButtonCmToInchClicked(strUserInput)

        }

        val btnInchToCm = view.findViewById<Button>(R.id.btnInchToCm)
        btnInchToCm.setOnClickListener {
            val strUserInput = etInput.text.toString()
            (activity as MainActivityButtonClickListener).onButtonInchToCmClicked(strUserInput)

        }
    }
}
