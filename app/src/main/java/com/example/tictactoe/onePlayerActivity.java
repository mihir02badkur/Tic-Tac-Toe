package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class onePlayerActivity extends AppCompatActivity {
    RadioButton botPlaysFirst;
    RadioButton youPlayFirst;
    RadioButton XChosen;
    RadioButton OChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
    }
    public void enterGame(View view){
        XChosen = (RadioButton) findViewById(R.id.Xchosen);
        OChosen = (RadioButton) findViewById(R.id.Ochosen);

        botPlaysFirst = (RadioButton) findViewById(R.id.BotPlaysFirst);
        youPlayFirst = (RadioButton) findViewById(R.id.YouPlayFirst);

        if(XChosen.isChecked() && botPlaysFirst.isChecked()){
            Intent BotFirstWithO = new Intent(this, game1BotFirstWithO.class);
            startActivity(BotFirstWithO);
        }else if(XChosen.isChecked() && !botPlaysFirst.isChecked()){
            Intent HumanFirstWithX = new Intent(this, game1HumanFirstWithX.class);
            startActivity(HumanFirstWithX);
        }else if(!XChosen.isChecked() && botPlaysFirst.isChecked()){
            Intent BotFirstWithX = new Intent(this, game1BotFirstWithX.class);
            startActivity(BotFirstWithX);
        }else{
            Intent HumanFirstWithO = new Intent(this, gameHumanFirstWithO.class);
            startActivity(HumanFirstWithO);

        }















    }
}