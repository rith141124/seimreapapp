package com.example.seimreab
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityTempleBinding

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
        binding.angkor.setOnClickListener {
            val intent = Intent(this, AngkorwatActivity::class.java)
            startActivity(intent)
        }
        binding.bapourn.setOnClickListener {
            val intent = Intent(this, bapournActivity::class.java)
            startActivity(intent)
        }
        binding.bayon.setOnClickListener{
            val intent = Intent(this, BayonActivity::class.java)
            startActivity(intent)

        }
        binding.phreskhan.setOnClickListener {
            val intent = Intent(this, PhreskhanActivity::class.java)
            startActivity(intent)
        }
        binding.banteaysrey.setOnClickListener {
            val intent = Intent(this, BanteaysreyActivity::class.java)
            startActivity(intent)
        }
        binding.taphrom.setOnClickListener {
            val intent = Intent(this, TaphromActivity::class.java)
            startActivity(intent)
        }
        binding.ichome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.icfav.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }
        binding.icpf.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.icst.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }



    }
}