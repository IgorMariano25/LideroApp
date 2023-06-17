package br.com.comptar.lidero_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.comptar.lidero_app.SharedData.Companion.conector
import br.com.comptar.lidero_app.SharedData.Companion.fazedor
import br.com.comptar.lidero_app.SharedData.Companion.gerador
import br.com.comptar.lidero_app.SharedData.Companion.organizador

class ResultadoPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_perfil)
        exibirResultadoFinal()


    }
    private fun exibirResultadoFinal() {

        val tvresultado = findViewById<TextView>(R.id.textView7)
        tvresultado.text = SharedData.gerador.toString()

    }

    private fun EncontraPerfilUsuario(){
        var maior = SharedData.gerador

        //Verifique se as outras variáveis são maiores do que o valor atual de 'maior'
        if (SharedData.organizador > maior) {
            maior = SharedData.organizador
        }

        if (SharedData.fazedor > maior) {
            maior = SharedData.fazedor
        }

        if (SharedData.conector > maior) {
            maior = SharedData.conector
        }
    }
}

