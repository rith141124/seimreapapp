package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityTempleBinding
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TempleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTempleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTempleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}