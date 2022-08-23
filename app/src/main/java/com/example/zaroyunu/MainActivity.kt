package com.example.zaroyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    private lateinit var roll_Dice:Button
    private lateinit var dice_VEC:ImageView
    private lateinit var result_Text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result_Text=findViewById(R.id.textView_Result)
        dice_VEC=findViewById(R.id.imageView_Dice)
        roll_Dice=findViewById(R.id.button_RollDice)
        roll_Dice.setOnClickListener {
           rollDice()
        }
    }
    private fun rollDice(){
        val randomInt= Random.nextInt(6)+1
        var drawableResource=when(randomInt){
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5
            else -> R.drawable.ic_dice_6
        }
        dice_VEC.setImageResource(drawableResource)
        result_Text.text="Gelen Zar $randomInt "
    }
}