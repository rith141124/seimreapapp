package com.example.seimreab
import android.content.Intent
import android.widget.Toast
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.forgot.setOnClickListener{
            val intent = Intent(this, ForgotpasswordActivity::class.java)
            startActivity(intent)
        }
        binding.Register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignIn.setOnClickListener {
                    val email = binding.etEmail.text.toString()
                    val password = binding.etPassword.text.toString()

                    if (email.isEmpty() || password.isEmpty()) {
                        Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                    }
                }
       }
}

