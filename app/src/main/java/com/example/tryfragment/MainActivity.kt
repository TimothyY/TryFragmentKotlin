package com.example.tryfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), MainActivityButtonClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    // Implement the interface method to receive the message from the bottom fragment
    override fun onButtonCmToInchClicked(message: String) {
        val upperFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view_1) as UpperFragment
        val inchResult = message.toDouble() / 2.54
        val result = message + " cm is equals to "+inchResult+" inch"
        upperFragment.updateMyResult(result)  // Assuming a method exists in TopFragment
    }

    override fun onButtonInchToCmClicked(message: String) {
        val upperFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view_1) as UpperFragment
        val cmResult = message.toDouble() * 2.54
        val result = message + " inch is equals to "+cmResult+" cm"
        upperFragment.updateMyResult(result)  // Assuming a method exists in TopFragment
    }

}