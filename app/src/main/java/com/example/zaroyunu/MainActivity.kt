package com.example.zaroyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    private lateinit var ZarAt:Button
    private lateinit var Zar:ImageView
    private lateinit var metin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        metin=findViewById(R.id.metin)
        Zar=findViewById(R.id.Zar)
        ZarAt=findViewById(R.id.ZarAt)
        ZarAt.setOnClickListener {
           rollDice()
        }


    }
    private fun rollDice(){
        val randomInt= Random.nextInt(6)+1
        var drawableResource=R.drawable.ic_question
        var sonuc=""
        when(randomInt){
            1 -> { drawableResource=R.drawable.ic_dice_1
                sonuc="Tekrar Denemelisin Gelen Sayı 1"}
            2 -> {drawableResource=R.drawable.ic_dice_2
                sonuc="Sanırım Zar Atmak Sana Göre Değil Gelen Sayı 2"}
            3 -> {drawableResource=R.drawable.ic_dice_3
                sonuc="İdare Eder Daha İyisini Yapmalısın Gelen Sayı 3"}
            4 -> {drawableResource=R.drawable.ic_dice_4
                sonuc="İyi Sayılır Gelen Sayı 4"}
            5 -> {drawableResource=R.drawable.ic_dice_5
                sonuc="Çok Yakındı Gelen Sayı 5"}
            else -> {drawableResource=R.drawable.ic_dice_6
                sonuc="Zirvedesin Tadını Çıkar Gelen Sayı 6" }
        }
        Zar.setImageResource(drawableResource)
        metin.text=sonuc
    }
}