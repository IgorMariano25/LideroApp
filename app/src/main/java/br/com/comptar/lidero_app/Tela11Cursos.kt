package br.com.comptar.lidero_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Tela11Cursos : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_tela_11_cursos)

        val btnGoToPerfil = findViewById<ImageButton>(R.id.ivVetorPerfil)
        btnGoToPerfil.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Tela11Cursos, Tela10Perifl::class.java)
            startActivity(intent)
        }

        val btnGoToHome = findViewById<ImageButton>(R.id.ivVetorHome)
        btnGoToHome.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Tela11Cursos, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
