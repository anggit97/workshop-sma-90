package com.anggitprayogo.alchemist

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //buat sharedpreferences
        val sharedPreferences = getSharedPreferences(Constant.SharedPrefName, Context.MODE_PRIVATE)

        //untuk mengedit nilai sharedpreferences
        val editor = sharedPreferences.edit()

        //deklarasi id
        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        //Kasih aksi klik pada button register
        btnRegister.setOnClickListener {
            //ambil nilai email, nama, dan password
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()


            //Simpan nilai email, name, dan password ke dalam sharedprefernces
            editor.putString(Constant.Email, email)
            editor.putString(Constant.Name, name)
            editor.putString(Constant.Password, password)
            editor.apply()
        }


        //Ambil data dari sharedprefernces
        val name = sharedPreferences.getString(Constant.Name, "")
        val email = sharedPreferences.getString(Constant.Email, "")
        val password = sharedPreferences.getString(Constant.Password, "")

        //deklarasi id tvResult
        val tvResult = findViewById<TextView>(R.id.tvResult)

        //Tempel hasil dari db ke textview
        tvResult.text = "Name: $name, Email: $email, Password: $password"
    }
}