package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            finish()
        }
        binding.btnChangePassword.setOnClickListener {
            val intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)
        }
        binding.changepin.setOnClickListener {
            val intent = Intent(this, ChangePinActivity::class.java)
            startActivity(intent)
        }
        binding.cteatepin.setOnClickListener {
            val intent = Intent(this, CreatePinActivity::class.java)
            startActivity(intent)
        }

    }
}
