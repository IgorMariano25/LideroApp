package br.com.comptar.lidero_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta4)

        val btnActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta4Activity, Pergunta5Activity::class.java)
            startActivity(intent)
        }
    }
}