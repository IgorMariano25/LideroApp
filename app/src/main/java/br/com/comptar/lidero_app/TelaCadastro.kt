package br.com.comptar.lidero_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_cadastro)

        // Alterando entre as telas ao clicar no botão de confirmar resposta
        val btnConfirmarCadastro = findViewById<Button>(R.id.btnCriarConta)
        btnConfirmarCadastro.setOnClickListener {
            val intent = Intent(this@TelaCadastro, TelaTransicaoPerguntas::class.java)
            startActivity(intent)
        }
    }
}