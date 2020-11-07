package com.anggitprayogo.alchemist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Step 1: Buat timer 2 detik
        Handler().postDelayed(Runnable {

            //Blok ini akan dijalankan setelah 2 detik berakhir
            //Step 2: Pindah ke halaman login
            val intent = Intent(this, LoginActivity::class.java)

            //Step 3: Tambahkan flag (untuk mencegah activity terpanggil kembali ketika di tekan tombol "back")
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

            //Step 4: Jalan activity
            startActivity(intent)

        }, 2000L)
    }
}