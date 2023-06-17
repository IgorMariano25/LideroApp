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

        var maior = SharedData.gerador
        var perfil : String = "gerador"
        var trilha : String = "Trilha Gerador"

        //Verifique se as outras variáveis são maiores do que o valor atual de 'maior'
        if (SharedData.organizador > maior) {
            maior = SharedData.organizador
            perfil = "Organizador"
            trilha = "Trilha Organizador"

        }

        if (SharedData.fazedor > maior) {
            maior = SharedData.fazedor
            perfil = "Fazedor"
            trilha ="Trilha Fazedor"
        }

        if (SharedData.conector > maior) {
            maior = SharedData.conector
            perfil ="Conector"
            trilha = "trilha Conector"
        }

        val tvPerfil = findViewById<TextView>(R.id.textView2)
        tvPerfil.text = "De acordo com as informções fornecidas, identificamos que o seu perfil é ${perfil} e a trilha que melhor atende a sua demanda de carreira é:"

        val tvTrilha = findViewById<TextView>(R.id.textView7)
        tvTrilha.text = trilha


    }

}

