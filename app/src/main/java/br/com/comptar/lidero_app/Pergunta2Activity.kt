package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class Pergunta2Activity : AppCompatActivity() {

    private lateinit var  btnConfirmaRespostabActivityPergunta2 : Button
    private var selectedButton: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta2)

        btnActivityPergunta2 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta2Activity, Pergunta3Activity::class.java)
            startActivity(intent)
        }
    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnActivityPergunta2.setTextColor(Color.WHITE)
        btnActivityPergunta2.setBackgroundColor(cor_verde_btn_habilitado)
        btnActivityPergunta2.isEnabled = true
    }

    private fun DesabilitarButtonConfirmarRespoasta() {
        btnActivityPergunta2.setTextColor(Color.WHITE)
        btnActivityPergunta2.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnActivityPergunta2.isEnabled = false
    }
}