package br.ulbra.atividades

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variável do contador
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun contarClique(view: View) {

        // Aumenta o contador em 1
        contador++

        // Encontra o TextView
        val txtContador = findViewById<TextView>(R.id.txtContador)

        // Atualiza o texto
        txtContador.text = "Cliques: $contador"

        // Imprime no Logcat
        println("botão clicado $contador vezes")
    }
}