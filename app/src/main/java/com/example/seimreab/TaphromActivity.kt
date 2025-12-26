package com.example.seimreab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityTaphromBinding

class TaphromActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaphromBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaphromBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, TempleActivity::class.java)
            startActivity(intent)
        }

    }
}