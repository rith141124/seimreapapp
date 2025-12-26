package com.example.seimreab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityKulenBinding

class KulenActivity : AppCompatActivity() {
  private lateinit var binding: ActivityKulenBinding
  override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = ActivityKulenBinding.inflate(layoutInflater)
      setContentView(binding.root)
      binding.btnBack.setOnClickListener {
          finish()
      }

  }
}