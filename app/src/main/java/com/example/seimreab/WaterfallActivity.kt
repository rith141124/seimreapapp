package com.example.seimreab
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityWaterfallBinding

class WaterfallActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWaterfallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWaterfallBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            finish()
        }
        binding.kulen.setOnClickListener {
            val intent = Intent(this, KulenActivity::class.java)
            startActivity(intent)
        }

    }
}