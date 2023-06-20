package br.com.comptar.lidero_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnGoToPerfil = findViewById<ImageButton>(R.id.ivVetorPerfil)
        btnGoToPerfil.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@HomeActivity, Tela10Perifl::class.java)
            startActivity(intent)
        }

        val btnGoToCursos = findViewById<ImageButton>(R.id.ivVetorCursos)
        btnGoToCursos.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@HomeActivity, Tela11Cursos::class.java)
            startActivity(intent)
        }
    }

}