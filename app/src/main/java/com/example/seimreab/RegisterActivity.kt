package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {
   private lateinit var binding: ActivityRegisterBinding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityRegisterBinding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.back.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
       }
       binding.Save.setOnClickListener {
           val intent = Intent(this, Register1Activity::class.java)
           startActivity(intent)
       }

   }
}