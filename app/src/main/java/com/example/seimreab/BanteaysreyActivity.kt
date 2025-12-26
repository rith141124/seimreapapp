package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityBanteaysreyBinding

class BanteaysreyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBanteaysreyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBanteaysreyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, TempleActivity::class.java)
            startActivity(intent)
        }
    }
}