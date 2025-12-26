package com.example.seimreab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityForgotPasswordstBinding

class ForgotPasswordstActivity : AppCompatActivity() {
   private lateinit var binding: ActivityForgotPasswordstBinding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityForgotPasswordstBinding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.back.setOnClickListener {
           finish()
       }


   }
}