package com.example.seimreab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityRegister1Binding

class Register1Activity : AppCompatActivity() {
   private lateinit var binding: ActivityRegister1Binding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityRegister1Binding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.back.setOnClickListener {
           finish()
       }
       binding.btnSave.setOnClickListener {
           val username = binding.etUsername.text.toString().trim()
           val password = binding.etPassword.text.toString().trim()
           val confirmPassword = binding.etConfirmPassword.text.toString().trim()
           if (username.isEmpty()) {
               binding.etUsername.error = "Username required"
               return@setOnClickListener
           }

           if (password.isEmpty()) {
               binding.etPassword.error = "Password required"
               return@setOnClickListener
           }

           if (password != confirmPassword) {
               binding.etConfirmPassword.error = "Passwords do not match"
               return@setOnClickListener
           }
           val intent = Intent(this, Register2Activity::class.java)
           intent.putExtra("USERNAME", username)
           startActivity(intent)
           finish()
       }
   }
}

