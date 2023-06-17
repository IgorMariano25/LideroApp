package br.com.comptar.lidero_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.ImageView
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

        val btnAvancar = findViewById<Button>(R.id.btnAvancar)
        btnAvancar .setOnClickListener {
            val intent = Intent(this@ResultadoPerfil, Tela11Cursos::class.java)
            startActivity(intent)
        }

    }

    private fun exibirResultadoFinal() {
        val ImageView = findViewById<ImageView>(R.id.imageView6)
        var maior = SharedData.gerador
        var perfil : String = "gerador"
        var trilhaRecomendada : String = "Rumo ao crescimento \uD83C\uDD99☝️"

        //Verifique se as outras variáveis são maiores do que o valor atual de 'maior'
        if (SharedData.organizador > maior) {
            maior = SharedData.organizador
            perfil = "Organizador"
            trilhaRecomendada = "Organizando seus pontos fortes \uD83D\uDCAA"
            ImageView.setImageResource(R.drawable.vetor_perfil_organizador)
        }

        if (SharedData.fazedor > maior) {
            maior = SharedData.fazedor
            perfil = "Fazedor"
            trilhaRecomendada ="Chegando com tudo \uD83D\uDE80"
            ImageView.setImageResource(R.drawable.vetor_perfil_fazedor)
        }

        if (SharedData.conector > maior) {
            maior = SharedData.conector
            perfil ="Conector"
            trilhaRecomendada = "Construindo seu caminho \uD83E\uDDF1"
            ImageView.setImageResource(R.drawable.vetor_perfil_conector)
        }

        val tvPerfil = findViewById<TextView>(R.id.textView2)
        val texto = "De acordo com as informações fornecidas, identificamos que o seu perfil é ${perfil} e a trilha que melhor atende a sua demanda de carreira é:"
        val spannable = SpannableString(texto)

        // Define a cor que deseja aplicar à palavra ${perfil}
        val cor = Color.parseColor("#FF6600")

        // Encontra a posição da palavra ${perfil} no texto
        val posicaoInicio = texto.indexOf("${perfil}")
        val posicaoFim = posicaoInicio + "${perfil}".length

        // Aplica a cor à palavra ${perfil}
        spannable.setSpan(ForegroundColorSpan(cor), posicaoInicio, posicaoFim, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Define o texto formatado no TextView
        tvPerfil.text = spannable

        val tvTrilha = findViewById<TextView>(R.id.textView7)
        tvTrilha.text = trilhaRecomendada
    }
}