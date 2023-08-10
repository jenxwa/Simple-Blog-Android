package com.example.itstudentspool2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.itstudentspool2.R

import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ApplyToJobActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_apply_to_this_job)

        val nameEditText: EditText = findViewById(R.id.name_edit_text)
        val emailEditText: EditText = findViewById(R.id.email_edit_text)
        val phoneEditText: EditText = findViewById(R.id.phone_edit_text)
        val resumeEditText: EditText = findViewById(R.id.resume_edit_text)
        val submitButton: Button = findViewById(R.id.submit_button)

        submitButton.setOnClickListener {
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailEditText.text).matches()){
                Toast.makeText(this, "No valid email provided!", Toast.LENGTH_SHORT).show()
            } else {
                if (!android.util.Patterns.PHONE.matcher(phoneEditText.text).matches()) {
                    Toast.makeText(this, "No valid phone number provided!", Toast.LENGTH_SHORT).show()
                } else {
                    if (nameEditText.text.isNotEmpty() &&
                        emailEditText.text.isNotEmpty() &&
                        phoneEditText.text.isNotEmpty() &&
                        resumeEditText.text.isNotEmpty()) {
                        Toast.makeText(this, "Thank you for applying!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}

