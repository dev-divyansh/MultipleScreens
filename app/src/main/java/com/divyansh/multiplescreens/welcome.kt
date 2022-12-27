package com.divyansh.multiplescreens

import android.R.layout
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyansh.multiplescreens.databinding.ActivityWelcomeBinding

class welcome : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intent = getIntent()
       var DATA =  intent.getStringExtra("msg")

        binding.textView2.setText(DATA)


    }
}