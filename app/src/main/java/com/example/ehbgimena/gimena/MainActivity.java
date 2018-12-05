package com.example.ehbgimena.gimena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonstart;
    private Button buttoncontrol;
    private Button buttonhighscore;
    private Button buttonquit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call();
        execute();
    }
    private void call(){
        buttonstart = findViewById(R.id.buttonstart);
        buttoncontrol = findViewById(R.id.buttoncontrol);
        buttonhighscore = findViewById(R.id.buttonhighscore);
        buttonquit = findViewById(R.id.buttonquit);

    }
    private void execute (){

        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
        buttonquit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
