package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class Pergunta9Activity : AppCompatActivity() {

    private lateinit var  btnConfirmaRespostaActivityPergunta9 : Button
    private var selectedButton: View? = null

    //Criando cor para o botão confirmar resposta desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(203,203,203)
    //Criando cor para o botão confirmar resposta habilitado
    val cor_carbon_btn_habilitado = Color.rgb(51,51,51)
    // Criando uma nova cor para adicionar ao botão de respostas
    val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta9)

        btnConfirmaRespostaActivityPergunta9 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta9.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta9Activity, Pergunta10Activity::class.java)
            startActivity(intent)
        }

        val btnDiscTotal1 = findViewById<Button>(R.id.btnDiscTotal)
        btnDiscTotal1.setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 1
        }

        val btnDisc1 = findViewById<Button>(R.id.btnDisc)
        btnDisc1.setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 2
        }

        val btnNem = findViewById<Button>(R.id.btnNemDiscNemCon)
        btnNem.setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 3
        }

        val btnCon1 = findViewById<Button>(R.id.btnConcord)
        btnCon1.setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 4
        }

        val btnConTotal1 = findViewById<Button>(R.id.btnConcorTotal)
        btnConTotal1 .setOnClickListener {
            selectButton(btnDiscTotal1)
            SharedData.gerador += 5
        }
    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta9.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta9.setBackgroundColor(cor_carbon_btn_habilitado)
        btnConfirmaRespostaActivityPergunta9.isEnabled = true
    }

    private fun DesabilitarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta9.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta9.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta9.isEnabled = false
    }
    
    private fun selectButton(button: Button) {
        selectedButton?.apply {
            setBackgroundColor(Color.WHITE)
        }
        button.setBackgroundColor(cor_cinza_btn_clicado)
        selectedButton = button
    }
}