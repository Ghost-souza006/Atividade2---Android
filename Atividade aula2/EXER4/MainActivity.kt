package br.ulbra.atividades

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Contador de rolagens
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun rolarDado(view: View) {

        // Aumenta o contador de rolagens
        contador++

        // Sorteia um número de 1 a 6
        val resultado = Random.nextInt(6) + 1

        // Encontra o TextView
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        // Mostra a rolagem e o resultado
        txtResultado.text = "Rolagem $contador: resultado $resultado"

        // Registra no Logcat
        println("Rolagem $contador: resultado $resultado")
    }
}