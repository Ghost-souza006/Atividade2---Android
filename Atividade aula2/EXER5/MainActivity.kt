package br.ulbra.atividades

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    // Função do botão Aviso
    fun aviso(view: View) {

        println("Botão Aviso foi clicado!")
    }

    // Função do botão Sortear
    fun sortear(view: View) {

        val numero = Random.nextInt(1, 11)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        txtResultado.text = "Número sorteado: $numero"
    }

    // Função do botão Ambos
    fun avisarESortear(view: View) {

        // Avisa no Logcat
        println("Botão Ambos foi clicado!")

        // Sorteia um número
        val numero = Random.nextInt(1, 11)

        // Atualiza o TextView
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        txtResultado.text = "Número sorteado: $numero"
    }
}