package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityPubstreetBinding

class PubstreetActivity : AppCompatActivity() {
   private lateinit var binding: ActivityPubstreetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPubstreetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, SeimreabActivity::class.java)
            startActivity(intent)
        }
    }
}