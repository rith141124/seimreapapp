package com.example.seimreab

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityPhreskhanBinding

class PhreskhanActivity : AppCompatActivity() {
   private lateinit var binding: ActivityPhreskhanBinding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityPhreskhanBinding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.btnBack.setOnClickListener {
           val intent = Intent(this, TempleActivity::class.java)
           startActivity(intent)
       }

   }
}