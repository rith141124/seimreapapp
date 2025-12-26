package com.example.seimreab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seimreab.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back button
        binding.back.setOnClickListener {
            finish()
        }
        setupGenderSelection()
        binding.Save.setOnClickListener {
            val firstName = binding.etFirstName.text.toString().trim()
            val lastName = binding.etLastName.text.toString().trim()
            val gender = getSelectedGender()

            // Optional validation
            if (firstName.isEmpty() || lastName.isEmpty()) {
                binding.etFirstName.error = "Required"
                binding.etLastName.error = "Required"
                return@setOnClickListener
            }

            val intent = Intent(this, Register1Activity::class.java)
            intent.putExtra("FIRST_NAME", firstName)
            intent.putExtra("LAST_NAME", lastName)
            intent.putExtra("GENDER", gender)
            startActivity(intent)
        }
    }

    private fun setupGenderSelection() {
        val checkBoxes = listOf(
            binding.cbMale,
            binding.cbFemale,
            binding.cbCustom
        )

        checkBoxes.forEach { checkBox ->
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    checkBoxes.forEach {
                        if (it != checkBox) it.isChecked = false
                    }
                }
            }
        }
    }

    private fun getSelectedGender(): String {
        return when {
            binding.cbMale.isChecked -> "Male"
            binding.cbFemale.isChecked -> "Female"
            binding.cbCustom.isChecked -> "Custom"
            else -> "Not selected"
        }
    }
}
