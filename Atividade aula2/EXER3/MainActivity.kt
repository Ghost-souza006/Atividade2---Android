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

    fun sortear(view: View) {

        // Sorteia um número de 1 até 100
        val numero = Random.nextInt(1, 101)

        // Encontra o TextView
        val txtNumero = findViewById<TextView>(R.id.txtNumero)

        // Mostra o número sorteado na tela
        txtNumero.text = "Número sorteado: $numero"

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {

            println("número par sorteado: $numero")

        } else {

            println("número ímpar sorteado: $numero")
        }
    }
}