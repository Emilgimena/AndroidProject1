package com.example.ehbgimena.gimena;

import android.app.Activity;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main2Activity extends Activity {
    TextView timer;

    private String arrAlp[] = {"A", "A", "B", "B", "C", "C", "D", "D", "E", "E", "F", "F", "G",
            "G", "H", "H",};

    private int []bar = new int[] {
            R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13,
            R.id.btn14, R.id.btn15, R.id.btn16  };
    //Button but1, but2, but3, but4, but5, but6, but7, but8;
    //Button but9, but10, but11, but12, but13, but14, but15, but16;
    private static final String FORMAT = "%02d";

    int seconds , minutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        timer=(TextView) findViewById(R.id.timer);

        String []arr = this.getResources().getStringArray(R.array.alphabet);
        boolean []chosen_already = new boolean[8];
        String atrr = "";
        for(int i = 0; i < 16; i++) {
            Button btn = findViewById(bar[i]);
            Random r = new Random();
            int num = r.nextInt(arr.length);
            btn.setText(arr[num]);
        }

        new CountDownTimer(4000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                timer.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {

            }
        }.start();
    }
}
