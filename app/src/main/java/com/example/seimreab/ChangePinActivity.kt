package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import com.example.seimreab.databinding.ActivityChangePinBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChangePinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChangePinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            finish()
        }
        binding.changepin.setOnClickListener {
            val intent = Intent(this, ForgotPinActivity::class.java)
            startActivity(intent)
        }
    }
}