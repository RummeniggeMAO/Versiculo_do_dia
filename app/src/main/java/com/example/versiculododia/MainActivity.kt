package com.example.versiculododia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

//Enviando primeiro commit 26/10
class MainActivity : AppCompatActivity() {
    lateinit var botaoLeia: Button
    lateinit var textoMostra: TextView

    var versiculos = arrayOf(
        "Toda Escritura divinamente inspirada é proveitosa para ensinar," +
                " para redarguir, para corrigir," +
                " para instruir em justiça, para que o homem de Deus seja perfeito" +
                " e perfeitamente instruído para toda boa obra. \n \n \n 2 Timóteo 3:16-17",

        "Eu repreendo e castigo a todos quantos amo; sê, pois, zeloso e arrepende-te. \n \n Apocalipse 3:19",

        "Melhor é a repreensão aberta do que o amor encoberto. \n \n Provérbios 27:5",

        " Porque sou eu que conheço os planos que tenho para vocês', diz o Senhor, " +
                "'planos de fazê-los prosperar e não de causar dano, planos de dar a vocês esperança e " +
                "um futuro. \n \n Jeremias 29:11",

        "Mas os que confiam no Senhor renovam suas forças; voam alto, como águias." +
                " Correm e não se cansam, caminham e não desfalecem. \n \n  Isaías 40:30-31",

        "Tudo o que fizerem, façam de todo o coração, como para o Senhor e não para as pessoas," +
                "sabendo que receberão do Senhor a recompensa da herança." +
                "É a Cristo, o Senhor, que vocês estão servindo.  \n \n Colossenses 3:23-24",

        "Portanto, meus amados irmãos, sejam fortes e firmes. Trabalhem sempre para o Senhor com entusiasmo," +
                " pois vocês sabem que nada do que fazem para o Senhor é inútil. 1 Coríntios 15:58",

        "Que diremos, então, à vista destas coisas? Se Deus é por nós, quem será contra nós?" +
                "  \n \n Romanos 8:31",

        " Ele não se cansa nem fica exausto, sua sabedoria é insondável." +
                "Ele fortalece ao cansado e dá grande vigor ao que está sem forças." +
                "  \n \n Isaías 40:28-29",

        "Portanto, não nos cansemos de fazer o bem." +
                "No momento certo, teremos uma colheita de bênçãos, se não desistirmos." +
                "  \n \n Gálatas 6:9",

        "Sejam fortes e corajosos, não tenham medo, nem fiquem apavorados diante deles, porque o Senhor ," +
                " seu Deus, é quem vai com vocês; ele não os deixará, nem os abandonará." +
                " \n \n  Deuteronômio 31:6"


    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botaoLeia = findViewById(R.id.btn_leia)

        //intent de envio
        //val intent = Intent(this, ActivityExibicao::class.java)
    }

    fun versiculoRandomico(view: View) {
        val intent = Intent(this, ActivityExibicao::class.java)




        val numero = Random().nextInt(10)
        val mensagem = versiculos[numero]

        if (mensagem.isNotEmpty()) {
            intent.putExtra("mensagem", mensagem)
        }
        startActivity(intent)

        //textoMostra.setText(versiculos[numero])

    }

}