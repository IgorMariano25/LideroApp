package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import br.com.comptar.lidero_app.SharedData.Companion.gerador

class Pergunta1Activity : AppCompatActivity() {

    private lateinit var  btnConfirmaRespostaActivityPergunta1 : Button
    private var selectedButton: View? = null

    //Criando cor para o botão confirmar resposta desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(203,203,203)
    //Criando cor para o botão confirmar resposta habilitado
    val cor_carbon_btn_habilitado = Color.rgb(51,51,51)
    // Criando uma nova cor para adicionar ao botão de respostas
    val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta1)

        btnConfirmaRespostaActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta1Activity, Pergunta2Activity::class.java)
            startActivity(intent)
        }

        val btnDiscTotal1 = findViewById<Button>(R.id.btnDiscTotal)
        btnDiscTotal1.setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 1
        }

        val btnDisc1 = findViewById<Button>(R.id.btnDisc)
        btnDisc1.setOnClickListener {
            selectButton(btnDisc1)
            SharedData.gerador += 2
        }

        val btnNem = findViewById<Button>(R.id.btnNemDiscNemCon)
        btnNem.setOnClickListener {
            selectButton(btnNem)
            SharedData.gerador += 3
        }

        val btnCon1 = findViewById<Button>(R.id.btnConcord)
        btnCon1.setOnClickListener {
            selectButton(btnCon1)
            SharedData.gerador += 4
        }

        val btnConTotal1 = findViewById<Button>(R.id.btnConcorTotal)
        btnConTotal1 .setOnClickListener {
            selectButton(btnConTotal1)
            SharedData.gerador += 5
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
    
    private fun selectButton(button: Button) {
        selectedButton?.apply {
            setBackgroundColor(Color.WHITE)
        }
        button.setBackgroundColor(cor_cinza_btn_clicado)
        selectedButton = button
    }
}