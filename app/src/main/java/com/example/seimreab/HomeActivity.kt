package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
   private lateinit var binding: ActivityHomeBinding
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityHomeBinding.inflate(layoutInflater)
       setContentView(binding.root)
       binding.btnBack.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
       }
       binding.temple.setOnClickListener {
           val intent = Intent(this, TempleActivity::class.java)
           startActivity(intent)
       }
       binding.waterfal.setOnClickListener {
           val intent = Intent(this, WaterfallActivity::class.java)
           startActivity(intent)
       }
       binding.seimreab.setOnClickListener{
           val intent = Intent(this, SeimreabActivity::class.java)
           startActivity(intent)
       }
       binding.icst.setOnClickListener {
           val intent = Intent(this, SettingActivity::class.java)
           startActivity(intent)
       }
       binding.icpf.setOnClickListener {
           val intent = Intent(this, ProfileActivity::class.java)
           startActivity(intent)
       }
       binding.icfav.setOnClickListener {
           val intent = Intent(this, FavoriteActivity::class.java)
           startActivity(intent)
       }

   }

}
