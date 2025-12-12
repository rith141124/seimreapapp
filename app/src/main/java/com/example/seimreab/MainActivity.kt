package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignIn.setOnClickListener {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        }
        binding.forgot.setOnClickListener{
            val intent = Intent(this, ForgotpasswordActivity::class.java)
            startActivity(intent)
        }
        binding.Register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}
