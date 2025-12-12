package com.example.seimreab

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.seimreab.databinding.ActivityRegister3Binding

class Register3Activity : AppCompatActivity() {
   private lateinit var binding: ActivityRegister3Binding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityRegister3Binding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.back.setOnClickListener {
           finish()
       }

   }
}