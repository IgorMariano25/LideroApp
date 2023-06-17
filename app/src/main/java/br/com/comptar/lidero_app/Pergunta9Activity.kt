package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta9)

        val btnActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta9Activity, Pergunta10Activity::class.java)
            startActivity(intent)
        }
    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta1.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta1.setBackgroundColor(cor_carbon_btn_habilitado)
        btnConfirmaRespostaActivityPergunta1.isEnabled = true
    }

    private fun DesabilitarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta1.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta1.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta1.isEnabled = false
    }
}