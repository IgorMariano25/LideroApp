package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta1)

        val btnActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta1Activity, Pergunta2Activity::class.java)
            startActivity(intent)
        }
    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
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