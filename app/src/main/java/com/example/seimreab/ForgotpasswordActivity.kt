package com.example.seimreab
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityForgotpasswordBinding

class ForgotpasswordActivity : AppCompatActivity() {
      private lateinit var binding: ActivityForgotpasswordBinding
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          binding= ActivityForgotpasswordBinding.inflate(layoutInflater)
          setContentView(binding.root)
          binding.back.setOnClickListener {
              val intent = Intent(this, MainActivity::class.java)
              startActivity(intent)

          }
      }
}