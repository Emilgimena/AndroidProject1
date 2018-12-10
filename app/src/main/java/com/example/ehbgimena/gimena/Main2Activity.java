package com.example.ehbgimena.gimena;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main2Activity extends Activity {
    TextView timer, cr, incr;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    int[] alphabetArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int index;
    String corr, inco;
    Boolean ifPress1, ifPress2, ifPress3, ifPress4, ifPress5, ifPress6, ifPress7, ifPress8,
            ifPress9, ifPress10, ifPress11, ifPress12, ifPress13, ifPress14, ifPress15, ifPress16;
    int correctScore, incorrectScore;

    private int []bar = new int[] {
            R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13,
            R.id.btn14, R.id.btn15, R.id.btn16  };
    //Button but1, but2, but3, but4, but5, but6, but7, but8;
    //Button but9, but10, but11, but12, but13, but14, but15, but16;
    private static final String FORMAT = "%02d";

    int seconds , minutes;
    int buttonNumber = 1;
    int firstNumber, secondNumber;
    int firstClick, secondClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        __init__();

        b1.setTag("0");
        b2.setTag("1");
        b3.setTag("2");
        b4.setTag("3");
        b5.setTag("4");
        b6.setTag("5");
        b7.setTag("6");
        b8.setTag("7");
        b9.setTag("8");
        b10.setTag("9");
        b11.setTag("10");
        b12.setTag("11");
        b13.setTag("12");
        b14.setTag("13");
        b15.setTag("14");
        b16.setTag("15");

        shuffleArray(alphabetArray);
        correctScore = Integer.parseInt(cr.getText().toString());
        incorrectScore = Integer.parseInt(incr.getText().toString());

        final String questionMark = this.getResources().getString(R.string.unknown);
        boolean []chosen_already = new boolean[8];
        String atrr = "";

        for(int i = 0; i < 16; i++) {
            Button btn = findViewById(bar[i]);
            convAlpha(btn, i);
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b1, theCard);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b2, theCard);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b3, theCard);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b4, theCard);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b5, theCard);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b6, theCard);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b7, theCard);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b8, theCard);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b9, theCard);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b10, theCard);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b11, theCard);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b12, theCard);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b13, theCard);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b14, theCard);
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b15, theCard);
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b16, theCard);
            }
        });


        new CountDownTimer(4000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                timer.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                b1.setClickable(false);
                b2.setClickable(false);
                b3.setClickable(false);
                b4.setClickable(false);
                b5.setClickable(false);
                b6.setClickable(false);
                b7.setClickable(false);
                b8.setClickable(false);
                b9.setClickable(false);
                b10.setClickable(false);
                b11.setClickable(false);
                b12.setClickable(false);
                b13.setClickable(false);
                b14.setClickable(false);
                b15.setClickable(false);
                b16.setClickable(false);
            }

            public void onFinish() {
                for(int i = 0; i < 16; i++){
                    Button btn = findViewById(bar[i]);
                    btn.setText(questionMark);
                    btn.setClickable(true);
                }
            }
        }.start();
    }

    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    private void convAlpha(Button btn, int index) {
        if(alphabetArray[index] == 1) {
            btn.setText("A");
        } else if(alphabetArray[index] == 2) {
            btn.setText("B");
        } else if(alphabetArray[index] == 3) {
            btn.setText("C");
        } else if(alphabetArray[index] == 4) {
            btn.setText("D");
        } else if(alphabetArray[index] == 5) {
            btn.setText("E");
        } else if(alphabetArray[index] == 6) {
            btn.setText("F");
        } else if(alphabetArray[index] == 7) {
            btn.setText("G");
        } else if(alphabetArray[index] == 8) {
            btn.setText("H");
        } else if(alphabetArray[index] == 9) {
            btn.setText("A");
        } else if(alphabetArray[index] == 10) {
            btn.setText("B");
        } else if(alphabetArray[index] == 11) {
            btn.setText("C");
        } else if(alphabetArray[index] == 12) {
            btn.setText("D");
        } else if(alphabetArray[index] == 13) {
            btn.setText("E");
        } else if(alphabetArray[index] == 14) {
            btn.setText("F");
        } else if(alphabetArray[index] == 15) {
            btn.setText("G");
        } else if(alphabetArray[index] == 16) {
            btn.setText("H");
        }
    }

    private void checkAlpha(Button btn, int index) {
        if(alphabetArray[index] == 1) {
            btn.setText("A");
        } else if(alphabetArray[index] == 2) {
            btn.setText("B");
        } else if(alphabetArray[index] == 3) {
            btn.setText("C");
        } else if(alphabetArray[index] == 4) {
            btn.setText("D");
        } else if(alphabetArray[index] == 5) {
            btn.setText("E");
        } else if(alphabetArray[index] == 6) {
            btn.setText("F");
        } else if(alphabetArray[index] == 7) {
            btn.setText("G");
        } else if(alphabetArray[index] == 8) {
            btn.setText("H");
        } else if(alphabetArray[index] == 9) {
            btn.setText("A");
        } else if(alphabetArray[index] == 10) {
            btn.setText("B");
        } else if(alphabetArray[index] == 11) {
            btn.setText("C");
        } else if(alphabetArray[index] == 12) {
            btn.setText("D");
        } else if(alphabetArray[index] == 13) {
            btn.setText("E");
        } else if(alphabetArray[index] == 14) {
            btn.setText("F");
        } else if(alphabetArray[index] == 15) {
            btn.setText("G");
        } else if(alphabetArray[index] == 16) {
            btn.setText("H");
        }

        if(buttonNumber == 1) {
            firstNumber = alphabetArray[index];
            if(firstNumber > 8) {
                firstNumber = firstNumber - 8;
            }
            buttonNumber = 2;
            firstClick = index;

            btn.setEnabled(false);
        } else if(buttonNumber == 2) {
            secondNumber = alphabetArray[index];
            if(secondNumber > 8) {
                secondNumber = secondNumber - 8;
            }
            buttonNumber = 1;
            secondClick = index;

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        if(firstNumber == secondNumber) {
            if(firstClick == 0) {
                b1.setOnClickListener(null);
                b1.setPressed(true);
            } else if(firstClick == 1) {
                b2.setOnClickListener(null);
                b2.setPressed(true);
            } else if(firstClick == 2) {
                b3.setOnClickListener(null);
                b3.setPressed(true);
            } else if(firstClick == 3) {
                b4.setOnClickListener(null);
                b4.setPressed(true);
            } else if(firstClick == 4) {
                b5.setOnClickListener(null);
                b5.setPressed(true);
            } else if(firstClick == 5) {
                b6.setOnClickListener(null);
                b6.setPressed(true);
            } else if(firstClick == 6) {
                b7.setOnClickListener(null);
                b7.setPressed(true);
            } else if(firstClick == 7) {
                b8.setOnClickListener(null);
                b8.setPressed(true);
            } else if(firstClick == 8) {
                b9.setOnClickListener(null);
                b9.setPressed(true);
            } else if(firstClick == 9) {
                b10.setOnClickListener(null);
                b10.setPressed(true);
            } else if(firstClick == 10) {
                b11.setOnClickListener(null);
                b11.setPressed(true);
            } else if(firstClick == 11) {
                b12.setOnClickListener(null);
                b12.setPressed(true);
            } else if(firstClick == 12) {
                b13.setOnClickListener(null);
                b13.setPressed(true);
            } else if(firstClick == 13) {
                b14.setOnClickListener(null);
                b14.setPressed(true);
            } else if(firstClick == 14) {
                b15.setOnClickListener(null);
                b15.setPressed(true);
            } else if(firstClick == 15) {
                b16.setOnClickListener(null);
                b16.setPressed(true);
            }

            if(secondClick == 0) {
                b1.setOnClickListener(null);
                b1.setPressed(true);
            } else if(secondClick == 1) {
                b2.setOnClickListener(null);
                b2.setPressed(true);
            } else if(secondClick == 2) {
                b3.setOnClickListener(null);
                b3.setPressed(true);
            } else if(secondClick == 3) {
                b4.setOnClickListener(null);
                b4.setPressed(true);
            } else if(secondClick == 4) {
                b5.setOnClickListener(null);
                b5.setPressed(true);
            } else if(secondClick == 5) {
                b6.setOnClickListener(null);
                b6.setPressed(true);
            } else if(secondClick == 6) {
                b7.setOnClickListener(null);
                b7.setPressed(true);
            } else if(secondClick == 7) {
                b8.setOnClickListener(null);
                b8.setPressed(true);
            } else if(secondClick == 8) {
                b9.setOnClickListener(null);
                b9.setPressed(true);
            } else if(secondClick == 9) {
                b10.setOnClickListener(null);
                b10.setPressed(true);
            } else if(secondClick == 10) {
                b11.setOnClickListener(null);
                b11.setPressed(true);
            } else if(secondClick == 11) {
                b12.setOnClickListener(null);
                b12.setPressed(true);
            } else if(secondClick == 12) {
                b13.setOnClickListener(null);
                b13.setPressed(true);
            } else if(secondClick == 13) {
                b14.setOnClickListener(null);
                b14.setPressed(true);
            } else if(secondClick == 14) {
                b15.setOnClickListener(null);
                b15.setPressed(true);
            } else if(secondClick == 15) {
                b16.setOnClickListener(null);
                b16.setPressed(true);
            }
            correctScore += 1;
            corr = Integer.toString(correctScore);
            cr.setText(corr);

        } else {

            if(firstClick == 0) {
                b1.setText("???");
            } else if(firstClick == 1) {
                b2.setText("???");
            } else if(firstClick == 2) {
                b3.setText("???");
            } else if(firstClick == 3) {
                b4.setText("???");
            } else if(firstClick == 4) {
                b5.setText("???");
            } else if(firstClick == 5) {
                b6.setText("???");
            } else if(firstClick == 6) {
                b7.setText("???");
            } else if(firstClick == 7) {
                b8.setText("???");
            } else if(firstClick == 8) {
                b9.setText("???");
            } else if(firstClick == 9) {
                b10.setText("???");
            } else if(firstClick == 10) {
                b11.setText("???");
            } else if(firstClick == 11) {
                b12.setText("???");
            } else if(firstClick == 12) {
                b13.setText("???");
            } else if(firstClick == 13) {
                b14.setText("???");
            } else if(firstClick == 14) {
                b15.setText("???");
            } else if(firstClick == 15) {
                b16.setText("???");
            }

            if(secondClick == 0) {
                b1.setText("???");
            } else if(secondClick == 1) {
                b2.setText("???");
            } else if(secondClick == 2) {
                b3.setText("???");
            } else if(secondClick == 3) {
                b4.setText("???");
            } else if(secondClick == 4) {
                b5.setText("???");
            } else if(secondClick == 5) {
                b6.setText("???");
            } else if(secondClick == 6) {
                b7.setText("???");
            } else if(secondClick == 7) {
                b8.setText("???");
            } else if(secondClick == 8) {
                b9.setText("???");
            } else if(secondClick == 9) {
                b10.setText("???");
            } else if(secondClick == 10) {
                b11.setText("???");
            } else if(secondClick == 11) {
                b12.setText("???");
            } else if(secondClick == 12) {
                b13.setText("???");
            } else if(secondClick == 13) {
                b14.setText("???");
            } else if(secondClick == 14) {
                b15.setText("???");
            } else if(secondClick == 15) {
                b16.setText("???");

            }
            incorrectScore += 1;
            inco = Integer.toString(incorrectScore);
            incr.setText(inco);
        }

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
    }

    private void __init__() {
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b10 = findViewById(R.id.btn10);
        b11 = findViewById(R.id.btn11);
        b12 = findViewById(R.id.btn12);
        b13 = findViewById(R.id.btn13);
        b14 = findViewById(R.id.btn14);
        b15 = findViewById(R.id.btn15);
        b16 = findViewById(R.id.btn16);
        timer=(TextView) findViewById(R.id.timer);
        cr = findViewById(R.id.correct);
        incr = findViewById(R.id.incorr);
    }
}
