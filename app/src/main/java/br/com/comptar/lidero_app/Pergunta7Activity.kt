package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta7Activity : AppCompatActivity() {
    private var selectedButton: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta7)

        val btnDiscTotal1 = findViewById<Button>(R.id.btnDiscTotal)
        btnDiscTotal1.setOnClickListener {
            selectButton(btnDiscTotal1)
        }

        val btnDisc1 = findViewById<Button>(R.id.btnDisc)
        btnDisc1.setOnClickListener {
            selectButton(btnDiscTotal1)
        }

        val btnNem = findViewById<Button>(R.id.btnNemDiscNemCon)
        btnNem.setOnClickListener {
            selectButton(btnDiscTotal1)
        }

        val btnCon1 = findViewById<Button>(R.id.btnConcord)
        btnCon1.setOnClickListener {
            selectButton(btnDiscTotal1)
        }

        val btnConTotal1 = findViewById<Button>(R.id.btnConcorTotal)
        btnConTotal1 .setOnClickListener {
            selectButton(btnDiscTotal1)
        }

        val btnActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta1.setOnClickListener {
            //Exemplo de Intent Explicita
            val intent = Intent(this@Pergunta7Activity, Pergunta8Activity::class.java)
            startActivity(intent)
        }
    }

    private fun selectButton(button: Button) {
        selectedButton?.apply {
            setBackgroundColor(Color.WHITE)
        }

        button.setBackgroundColor(Color.rgb(153,149,149))
        selectedButton = button
    }
}