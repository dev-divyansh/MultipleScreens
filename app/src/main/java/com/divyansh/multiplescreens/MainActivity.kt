package com.divyansh.multiplescreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyansh.multiplescreens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.submit.setOnClickListener {

            var intent = Intent(this@MainActivity , welcome :: class.java)
            intent.putExtra("msg" , binding.username.text.toString())
            startActivity(intent)
        }


    }
}