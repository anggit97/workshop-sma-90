package com.anggitprayogo.alchemist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    //Step 6
    //Data yang ada didalam sistem (akun kita yang terdaftar didalam sistem)
    private var emailFromDatabase = "test@gmail.com"
    private var passwordFromDatabase = "12345678"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Step 1. memasang ID pada setiap komponennya (etEmail, etPassword, btnLogin) (DONE)

        //Step 2. Deklarasi komponen (DONE)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        //Step 3. Kasih action button click
        btnLogin.setOnClickListener {

            //Step 4. mengambil data email dan password dari inputan berdasarkan id (DONE)
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            //Validasi login
            if (email.isEmpty()){
                etEmail.error = "Email harus diisi"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()){
                etPassword.error = "Password harus diisi"
                etPassword.requestFocus()
                return@setOnClickListener
            }


            //Step 7: Proses autentikasi pengguna ke sistem dengan email dan password
            if (email != emailFromDatabase){
                Toast.makeText(
                    this,
                    "Email tidak sesuai dengan yang ada didatabase",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            if (password != passwordFromDatabase){
                Toast.makeText(
                    this,
                    "Password tidak sesuai dengan yang ada didatabase",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            //Step 5. Tampilkan
            Toast.makeText(this, "Berhasil Login", Toast.LENGTH_SHORT).show()
        }
    }
}