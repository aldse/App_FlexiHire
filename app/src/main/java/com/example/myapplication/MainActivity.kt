package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botaologar : Button = findViewById(R.id.button3)
        var botaocadastrar : Button = findViewById(R.id.button4)
        var botaorecuperar : Button = findViewById(R.id.button)

        botaologar.setOnClickListener {
            var fraglogar : FragmentLogar = FragmenrLogar.newInstance("", "")
            var transacao : FragmentTransaction = supportFragmentManager.beginTransaction();
            transacao.add(R.id.fragmentContainerView, fraglogar)
            transacao.commit();
        }

        botaocadastrar.setOnClickListener {
            var fragconversa : FragmentCadastrar = FragmentCadastrar.newInstance("", "")
            var transacao : FragmentTransaction = supportFragmentManager.beginTransaction();
            transacao.add(R.id.fragmentContainerView, fragconversa)
            transacao.commit();
        }

        botaorecuperar.setOnClickListener {
            var fragrecuperar : FragmentRecuperar = FragmentRecuperar.newInstance("", "")
            var transacao : FragmentTransaction = supportFragmentManager.beginTransaction();
            transacao.add(R.id.fragmentContainerView, fragrecuperar)
            transacao.commit();
        }
    }
}


