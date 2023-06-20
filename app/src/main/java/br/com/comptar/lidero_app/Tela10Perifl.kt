package br.com.comptar.lidero_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela10Perifl : AppCompatActivity (){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportActionBar?.hide()
            setContentView(R.layout.activity_tela_10_perfil)
            exibirResultadoFinal()

            val btnGoToHome = findViewById<ImageButton>(R.id.ivVetorHome)
            btnGoToHome.setOnClickListener {
                //Exemplo de Intent Explicita
                val intent = Intent(this@Tela10Perifl, HomeActivity::class.java)
                startActivity(intent)
            }

            val btnGoToCursos = findViewById<ImageButton>(R.id.ivVetorCursos)
            btnGoToCursos.setOnClickListener {
                //Exemplo de Intent Explicita
                val intent = Intent(this@Tela10Perifl, Tela11Cursos::class.java)
                startActivity(intent)
            }

            val tvRefaçaOQuiz = findViewById<TextView>(R.id.tvRefaçaOQuiz)
            tvRefaçaOQuiz.setOnClickListener{
                val intent = Intent(this@Tela10Perifl, Pergunta1Activity::class.java)
                startActivity(intent)
            }

            val SetaRefaçaOQuiz = findViewById<ImageView>(R.id.ivSetaDireita2)
            SetaRefaçaOQuiz.setOnClickListener{
                val intent = Intent(this@Tela10Perifl, Pergunta1Activity::class.java)
                startActivity(intent)
            }
        }

    private fun exibirResultadoFinal() {
        var maior = SharedData.gerador
        var perfil : String = "Gerador"
        var trilhaRecomendada : String = "Rumo ao crescimento \uD83C\uDD99☝️"

        //Verifique se as outras variáveis são maiores do que o valor atual de 'maior'
        if (SharedData.organizador > maior) {
            maior = SharedData.organizador
            perfil = "Organizador"
            trilhaRecomendada = "Organizando seus pontos fortes \uD83D\uDCAA"
        }
        else{
            perfil = "Quiz não foi realizado \uD83D\uDE22"
            trilhaRecomendada = "Quiz não foi realizado \uD83D\uDE22"
        }

        if (SharedData.fazedor > maior) {
            maior = SharedData.fazedor
            perfil = "Fazedor"
            trilhaRecomendada ="Chegando com tudo \uD83D\uDE80"
        }
        else{
            perfil = "Quiz não foi realizado \uD83D\uDE22"
            trilhaRecomendada = "Quiz não foi realizado \uD83D\uDE22"
        }

        if (SharedData.conector > maior) {
            maior = SharedData.conector
            perfil ="Conector"
            trilhaRecomendada = "Construindo seu caminho \uD83E\uDDF1"
        }
        else{
            perfil = "Quiz não foi realizado \uD83D\uDE22"
            trilhaRecomendada = "Quiz não foi realizado \uD83D\uDE22"
        }

        val tvResultadoPerfil = findViewById<TextView>(R.id.tvResultadoPerfil)
        tvResultadoPerfil.text = "${perfil}"

        val tvResultadoTrilha = findViewById<TextView>(R.id.tvResultadoTrilhaRecomendada)
        tvResultadoTrilha.text = trilhaRecomendada
    }
}