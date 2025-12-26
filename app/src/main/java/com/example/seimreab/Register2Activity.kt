package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityRegister2Binding

class Register2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            finish()
        }
        binding.btnEnter.setOnClickListener {
            val phone = binding.etPhone.text.toString().trim()

            if (phone.isEmpty()) {
                binding.etPhone.error = "Phone number required"
                return@setOnClickListener
            }

            // TODO: Send SMS verification code
        }
        binding.btnSave.setOnClickListener {
            val code = binding.etCode.text.toString().trim()

            if (code.isEmpty()) {
                binding.etCode.error = "Verification code required"
                return@setOnClickListener
            }

            // TODO: Verify SMS code
            val intent = Intent(this, Register3Activity::class.java)
            intent.putExtra("PHONE", binding.etPhone.text.toString())
            startActivity(intent)
            finish()
        }
    }
}