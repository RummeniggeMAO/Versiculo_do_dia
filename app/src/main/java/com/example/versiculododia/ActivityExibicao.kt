package com.example.versiculododia

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityExibicao : AppCompatActivity() {
    lateinit var textMensagem: TextView
    lateinit var btnEncerrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exibicao)

        textMensagem = findViewById(R.id.text_mensagem)
        btnEncerrar = findViewById(R.id.btn_encerrar)

        val bundle = intent.extras

        if (bundle != null) {
            val mensagem = bundle.getString("mensagem")

            //agora é setar a mensagem!!
            textMensagem.text = "Reflita no texto: \n \n $mensagem"

        }

        btnEncerrar.setOnClickListener {
            finishAffinity()
        }

    }
}