package com.example.seimreab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityBapournBinding

class bapournActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBapournBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBapournBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, TempleActivity::class.java)
            startActivity(intent)
        }
    }
}