package br.com.comptar.lidero_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Tela10Perifl : AppCompatActivity (){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportActionBar?.hide()
            setContentView(R.layout.activity_tela_10_perfil)
        }
}