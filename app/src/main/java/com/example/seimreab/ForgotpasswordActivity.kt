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
          binding.btnEnter.setOnClickListener {
              val phone = binding.etPhone.text.toString().trim()
              val email = binding.etEmail.text.toString().trim()

          }

          binding.btnChangePassword.setOnClickListener {
              val code = binding.etCode.text.toString().trim()

          }
      }

}
