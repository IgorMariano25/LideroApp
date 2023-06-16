package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta8)

        val btnActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta8Activity, Pergunta9Activity::class.java)
            startActivity(intent)
        }
    }

    private fun HabiltarButtonConfirmarResposta() {
        btnConfResp.setTextColor(Color.WHITE)
        btnConfResp.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfResp.isEnabled = true
    }

    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfResp.setTextColor(Color.WHITE)
        btnConfResp.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfResp.isEnabled = false
    }
}