package com.example.seimreab

import android.os.Bundle
import com.example.seimreab.databinding.ActivityForgotPinBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotPinActivity : AppCompatActivity() {
   private lateinit var binding: ActivityForgotPinBinding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityForgotPinBinding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.back.setOnClickListener {
           finish()
       }

   }
}