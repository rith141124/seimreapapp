package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityChangePasswordBinding


class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnSave.setOnClickListener {
            val newPass = binding.etNewPassword.text.toString()
            val confirmPass = binding.etConfirmPassword.text.toString()

            if (newPass != confirmPass) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Password Updated", Toast.LENGTH_SHORT).show()
            }
        }
        binding.forgotpassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordstActivity::class.java)
            startActivity(intent)
        }
    }
}