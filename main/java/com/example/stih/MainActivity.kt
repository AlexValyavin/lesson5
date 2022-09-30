package com.example.stih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyTag","Я помню чудное мгновенье")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyTag","Передо мной явилась ты,")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyTag","Как мимолетное виденье,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyTag","рестарт приложения")
    }


    override fun onPause() {
        super.onPause()
        Log.d("MyTag"," вызвана пауза")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyTag","приложение остановлено")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyTag","Приложение остановлено и выгружено из памяти")
    }

}