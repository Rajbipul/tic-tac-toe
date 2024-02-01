package com.example.crossx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Players  description : 1 is X and 2 is O
    var player = 1
    var current_player  = 1

    var score_x : Int = 0
    var score_o : Int = 0

    fun onclick(view: View){ // to check which button is being pressed.

        val bt:Button = view as Button
        var cell = 0

        when(bt.id){
            R.id.r1bt1 -> cell = 1
            R.id.r1bt2 -> cell = 2
            R.id.r1bt3 -> cell = 3

            R.id.r2bt1 -> cell = 4
            R.id.r2bt2 -> cell = 5
            R.id.r2bt3 -> cell = 6

            R.id.r3bt1 -> cell = 7
            R.id.r3bt2 -> cell = 8
            R.id.r3bt3 -> cell = 9
        }

        play(cell, bt)
    }

    fun play(cell:Int, bt : Button){
        if(player==1){
            bt.text="X"
            bt.isEnabled = false
            player=2
        }else{
            bt.text="O"
            bt.isEnabled = false
            player=1
        }
        checkWinner()
    }

    fun checkWinner(){
        val s_x : TextView = findViewById(R.id.cross_score)
        val s_o : TextView = findViewById(R.id.zero_score)

        val bt1 : Button = findViewById(R.id.r1bt1)
        val bt2 : Button = findViewById(R.id.r1bt2)
        val bt3 : Button = findViewById(R.id.r1bt3)
        val bt4 : Button = findViewById(R.id.r2bt1)
        val bt5 : Button = findViewById(R.id.r2bt2)
        val bt6 : Button = findViewById(R.id.r2bt3)
        val bt7 : Button = findViewById(R.id.r3bt1)
        val bt8 : Button = findViewById(R.id.r3bt2)
        val bt9 : Button = findViewById(R.id.r3bt3)

        if(bt1.text== bt2.text && bt2.text.toString() == bt3.text && bt3.text!= "" ){
            if(bt1.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt4.text== bt5.text && bt5.text == bt6.text && bt6.text!= ""){
            if(bt4.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt7.text== bt8.text&& bt8.text== bt9.text && bt9.text!= ""){
            if(bt7.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt1.text == bt4.text && bt4.text == bt7.text && bt7.text != ""){
            if(bt1.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt2.text == bt5.text && bt5.text == bt8.text && bt8.text != ""){
            if(bt2.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt3.text == bt6.text && bt6.text == bt9.text && bt9.text != ""){
            if(bt3.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt1.text == bt5.text && bt5.text == bt9.text && bt9.text!= ""){
            if(bt1.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt3.text == bt5.text && bt5.text == bt7.text && bt7.text != ""){
            if(bt3.text=="X"){
                ++score_x
                s_x.text = score_x.toString()
                Toast.makeText(this, "X Wins", Toast.LENGTH_SHORT).show()
            }else{
                ++score_o
                s_o.text = score_o.toString()
                Toast.makeText(this, "O Wins", Toast.LENGTH_SHORT).show()
            }
            clearall()
        }else if (bt1.text !="" && bt2.text !="" && bt3.text !="" && bt4.text !="" && bt5.text !="" && bt6.text !="" && bt7.text !="" && bt8.text !="" && bt9.text !=""){
            Toast.makeText(this, "Draws", Toast.LENGTH_SHORT).show()
            clearall()
        }
    }

    fun clearall(){
        val bt1 : Button = findViewById(R.id.r1bt1)
        val bt2 : Button = findViewById(R.id.r1bt2)
        val bt3 : Button = findViewById(R.id.r1bt3)
        val bt4 : Button = findViewById(R.id.r2bt1)
        val bt5 : Button = findViewById(R.id.r2bt2)
        val bt6 : Button = findViewById(R.id.r2bt3)
        val bt7 : Button = findViewById(R.id.r3bt1)
        val bt8 : Button = findViewById(R.id.r3bt2)
        val bt9 : Button = findViewById(R.id.r3bt3)

        bt1.text= ""
        bt2.text= ""
        bt3.text= ""
        bt4.text= ""
        bt5.text= ""
        bt6.text= ""
        bt7.text= ""
        bt8.text= ""
        bt9.text= ""

        bt1.isEnabled = true
        bt2.isEnabled = true
        bt3.isEnabled = true
        bt4.isEnabled = true
        bt5.isEnabled = true
        bt6.isEnabled = true
        bt7.isEnabled = true
        bt8.isEnabled = true
        bt9.isEnabled = true

        if (current_player==1){
            current_player=2
        }else{
            current_player=1
        }
        player=current_player

    }

    fun restartGame(view: View){
        val s_o : TextView = findViewById(R.id.zero_score)
        val s_x : TextView = findViewById(R.id.cross_score)

        score_o = 0
        s_o.text = score_o.toString()
        score_x = 0
        s_x.text = score_x.toString()

        val bt1 : Button = findViewById(R.id.r1bt1)
        val bt2 : Button = findViewById(R.id.r1bt2)
        val bt3 : Button = findViewById(R.id.r1bt3)
        val bt4 : Button = findViewById(R.id.r2bt1)
        val bt5 : Button = findViewById(R.id.r2bt2)
        val bt6 : Button = findViewById(R.id.r2bt3)
        val bt7 : Button = findViewById(R.id.r3bt1)
        val bt8 : Button = findViewById(R.id.r3bt2)
        val bt9 : Button = findViewById(R.id.r3bt3)

        bt1.text= ""
        bt2.text= ""
        bt3.text= ""
        bt4.text= ""
        bt5.text= ""
        bt6.text= ""
        bt7.text= ""
        bt8.text= ""
        bt9.text= ""

        bt1.isEnabled = true
        bt2.isEnabled = true
        bt3.isEnabled = true
        bt4.isEnabled = true
        bt5.isEnabled = true
        bt6.isEnabled = true
        bt7.isEnabled = true
        bt8.isEnabled = true
        bt9.isEnabled = true
    }
}