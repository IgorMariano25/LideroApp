package br.com.comptar.lidero_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar1)
        btnEntrar .setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)

        }

        val btnCadastrese = findViewById<Button>(R.id.btnCadastro)
        btnCadastrese.setOnClickListener{
            val intent = Intent(this@MainActivity, TelaCadastro::class.java)
            startActivity(intent)
        }
    }
}