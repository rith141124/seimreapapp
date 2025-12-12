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
           val intent = Intent(this, RegisterActivity::class.java)
           startActivity(intent)
       }
       binding.btnSave.setOnClickListener {
           val intent = Intent(this, Register2Activity::class.java)
           startActivity(intent)
       }

   }

}