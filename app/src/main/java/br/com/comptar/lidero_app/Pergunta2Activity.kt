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

    //Criando cor para o botão confirmar resposta desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(203,203,203)
    //Criando cor para o botão confirmar resposta habilitado
    val cor_carbon_btn_habilitado = Color.rgb(51,51,51)
    // Criando uma nova cor para adicionar ao botão de respostas
    val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta2)

        btnConfirmaRespostabActivityPergunta2 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostabActivityPergunta2.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta2Activity, Pergunta3Activity::class.java)
            startActivity(intent)
        }
    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmaRespostabActivityPergunta2.setTextColor(Color.WHITE)
        btnConfirmaRespostabActivityPergunta2.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmaRespostabActivityPergunta2.isEnabled = true
    }

    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfirmaRespostabActivityPergunta2.setTextColor(Color.WHITE)
        btnConfirmaRespostabActivityPergunta2.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostabActivityPergunta2.isEnabled = false
    }
}