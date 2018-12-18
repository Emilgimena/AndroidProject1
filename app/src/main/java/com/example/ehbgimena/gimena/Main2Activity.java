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

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24, b25;
    int[] alphabetArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                            20, 21, 22, 23, 24};
    int index;
    String corr, inco;
    int correctScore, incorrectScore;

    private int []bar = new int[] {
            R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
            R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn14,
            R.id.btn15, R.id.btn16, R.id.btn17, R.id.btn18, R.id.btn19, R.id.btn20,
            R.id.btn21, R.id.btn22, R.id.btn23, R.id.btn24, R.id.btn25,
    };

    private static final String FORMAT = "%02d";
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
        b14.setTag("12");
        b15.setTag("13");
        b16.setTag("14");
        b17.setTag("15");
        b18.setTag("16");
        b19.setTag("17");
        b20.setTag("18");
        b21.setTag("19");
        b22.setTag("20");
        b23.setTag("21");
        b24.setTag("22");
        b25.setTag("23");

        b13.setClickable(false);

        shuffleArray(alphabetArray);
        correctScore = Integer.parseInt(cr.getText().toString());
        incorrectScore = Integer.parseInt(incr.getText().toString());

        final String questionMark = this.getResources().getString(R.string.unknown);
        boolean []chosen_already = new boolean[8];
        String atrr = "";

        for(int i = 0; i < 24; i++) {
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

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b17, theCard);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b18, theCard);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b19, theCard);
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b20, theCard);
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b21, theCard);
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b22, theCard);
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b23, theCard);
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b24, theCard);
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(b25, theCard);
            }
        });


        new CountDownTimer(6000, 1000) { // adjust the milli seconds here

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
                b14.setClickable(false);
                b15.setClickable(false);
                b16.setClickable(false);
                b17.setClickable(false);
                b18.setClickable(false);
                b19.setClickable(false);
                b20.setClickable(false);
                b21.setClickable(false);
                b22.setClickable(false);
                b23.setClickable(false);
                b24.setClickable(false);
                b25.setClickable(false);
            }

            public void onFinish() {
                for(int i = 0; i < 24; i++){
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
            btn.setText("!");
        } else if(alphabetArray[index] == 2) {
            btn.setText("@");
        } else if(alphabetArray[index] == 3) {
            btn.setText("#");
        } else if(alphabetArray[index] == 4) {
            btn.setText("$");
        } else if(alphabetArray[index] == 5) {
            btn.setText("%");
        } else if(alphabetArray[index] == 6) {
            btn.setText("^");
        } else if(alphabetArray[index] == 7) {
            btn.setText("&");
        } else if(alphabetArray[index] == 8) {
            btn.setText("*");
        } else if(alphabetArray[index] == 9) {
            btn.setText("(");
        } else if(alphabetArray[index] == 10) {
            btn.setText(")");
        } else if(alphabetArray[index] == 11) {
            btn.setText("_");
        } else if(alphabetArray[index] == 12) {
            btn.setText("+");
        } else if(alphabetArray[index] == 13) {
            btn.setText("!");
        } else if(alphabetArray[index] == 14) {
            btn.setText("@");
        } else if(alphabetArray[index] == 15) {
            btn.setText("#");
        } else if(alphabetArray[index] == 16) {
            btn.setText("$");
        } else if(alphabetArray[index] == 17) {
            btn.setText("%");
        } else if(alphabetArray[index] == 18) {
            btn.setText("^");
        } else if(alphabetArray[index] == 19) {
            btn.setText("&");
        } else if(alphabetArray[index] == 20) {
            btn.setText("*");
        } else if(alphabetArray[index] == 21) {
            btn.setText("(");
        } else if(alphabetArray[index] == 22) {
            btn.setText(")");
        } else if(alphabetArray[index] == 23) {
            btn.setText("_");
        } else if(alphabetArray[index] == 24) {
            btn.setText("+");
        }
    }

    private void checkAlpha(Button btn, int index) {
        if(alphabetArray[index] == 1) {
            btn.setText("!");
        } else if(alphabetArray[index] == 2) {
            btn.setText("@");
        } else if(alphabetArray[index] == 3) {
            btn.setText("#");
        } else if(alphabetArray[index] == 4) {
            btn.setText("$");
        } else if(alphabetArray[index] == 5) {
            btn.setText("%");
        } else if(alphabetArray[index] == 6) {
            btn.setText("^");
        } else if(alphabetArray[index] == 7) {
            btn.setText("&");
        } else if(alphabetArray[index] == 8) {
            btn.setText("*");
        } else if(alphabetArray[index] == 9) {
            btn.setText("(");
        } else if(alphabetArray[index] == 10) {
            btn.setText(")");
        } else if(alphabetArray[index] == 11) {
            btn.setText("_");
        } else if(alphabetArray[index] == 12) {
            btn.setText("+");
        } else if(alphabetArray[index] == 13) {
            btn.setText("!");
        } else if(alphabetArray[index] == 14) {
            btn.setText("@");
        } else if(alphabetArray[index] == 15) {
            btn.setText("#");
        } else if(alphabetArray[index] == 16) {
            btn.setText("$");
        } else if(alphabetArray[index] == 17) {
            btn.setText("%");
        } else if(alphabetArray[index] == 18) {
            btn.setText("^");
        } else if(alphabetArray[index] == 19) {
            btn.setText("&");
        } else if(alphabetArray[index] == 20) {
            btn.setText("*");
        } else if(alphabetArray[index] == 21) {
            btn.setText("(");
        } else if(alphabetArray[index] == 22) {
            btn.setText(")");
        } else if(alphabetArray[index] == 23) {
            btn.setText("_");
        } else if(alphabetArray[index] == 24) {
            btn.setText("+");
        }

        if(buttonNumber == 1) {
            firstNumber = alphabetArray[index];
            if(firstNumber > 12) {
                firstNumber = firstNumber - 12;
            }
            buttonNumber = 2;
            firstClick = index;

            btn.setEnabled(false);
        } else if(buttonNumber == 2) {
            secondNumber = alphabetArray[index];
            if(secondNumber > 12) {
                secondNumber = secondNumber - 12;
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
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);

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
                b14.setOnClickListener(null);
                b14.setPressed(true);
            } else if(firstClick == 13) {
                b15.setOnClickListener(null);
                b15.setPressed(true);
            } else if(firstClick == 14) {
                b16.setOnClickListener(null);
                b16.setPressed(true);
            } else if(firstClick == 15) {
                b17.setOnClickListener(null);
                b17.setPressed(true);
            } else if(firstClick == 16) {
                b18.setOnClickListener(null);
                b18.setPressed(true);
            } else if(firstClick == 17) {
                b19.setOnClickListener(null);
                b19.setPressed(true);
            } else if(firstClick == 18) {
                b20.setOnClickListener(null);
                b20.setPressed(true);
            } else if(firstClick == 19) {
                b21.setOnClickListener(null);
                b21.setPressed(true);
            } else if(firstClick == 20) {
                b22.setOnClickListener(null);
                b22.setPressed(true);
            } else if(firstClick == 21) {
                b23.setOnClickListener(null);
                b23.setPressed(true);
            } else if(firstClick == 22) {
                b24.setOnClickListener(null);
                b24.setPressed(true);
            } else if(firstClick == 23) {
                b25.setOnClickListener(null);
                b25.setPressed(true);
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
                b14.setOnClickListener(null);
                b14.setPressed(true);
            } else if(secondClick == 13) {
                b15.setOnClickListener(null);
                b15.setPressed(true);
            } else if(secondClick == 14) {
                b16.setOnClickListener(null);
                b16.setPressed(true);
            } else if(secondClick == 15) {
                b17.setOnClickListener(null);
                b17.setPressed(true);
            } else if(secondClick == 16) {
                b18.setOnClickListener(null);
                b18.setPressed(true);
            } else if(secondClick == 17) {
                b19.setOnClickListener(null);
                b19.setPressed(true);
            } else if(secondClick == 18) {
                b20.setOnClickListener(null);
                b20.setPressed(true);
            } else if(secondClick == 19) {
                b21.setOnClickListener(null);
                b21.setPressed(true);
            } else if(secondClick == 20) {
                b22.setOnClickListener(null);
                b22.setPressed(true);
            } else if(secondClick == 21) {
                b23.setOnClickListener(null);
                b23.setPressed(true);
            } else if(secondClick == 22) {
                b24.setOnClickListener(null);
                b24.setPressed(true);
            } else if(secondClick == 23) {
                b25.setOnClickListener(null);
                b25.setPressed(true);
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
                b14.setText("???");
            } else if(firstClick == 13) {
                b15.setText("???");
            } else if(firstClick == 14) {
                b16.setText("???");
            } else if(firstClick == 15) {
                b17.setText("???");
            } else if(firstClick == 16) {
                b18.setText("???");
            } else if(firstClick == 17) {
                b19.setText("???");
            } else if(firstClick == 18) {
                b20.setText("???");
            } else if(firstClick == 19) {
                b21.setText("???");
            } else if(firstClick == 20) {
                b22.setText("???");
            } else if(firstClick == 21) {
                b23.setText("???");
            } else if(firstClick == 22) {
                b24.setText("???");
            } else if(firstClick == 23) {
                b25.setText("???");
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
                b14.setText("???");
            } else if(secondClick == 13) {
                b15.setText("???");
            } else if(secondClick == 14) {
                b16.setText("???");
            } else if(secondClick == 15) {
                b17.setText("???");
            } else if(secondClick == 16) {
                b18.setText("???");
            } else if(secondClick == 17) {
                b19.setText("???");
            } else if(secondClick == 18) {
                b20.setText("???");
            } else if(secondClick == 19) {
                b21.setText("???");
            } else if(secondClick == 20) {
                b22.setText("???");
            } else if(secondClick == 21) {
                b23.setText("???");
            } else if(secondClick == 22) {
                b24.setText("???");
            } else if(secondClick == 23) {
                b25.setText("???");
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
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b17.setEnabled(true);
        b18.setEnabled(true);
        b19.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);
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
        b17 = findViewById(R.id.btn17);
        b18 = findViewById(R.id.btn18);
        b19 = findViewById(R.id.btn19);
        b20 = findViewById(R.id.btn20);
        b21 = findViewById(R.id.btn21);
        b22 = findViewById(R.id.btn22);
        b23 = findViewById(R.id.btn23);
        b24 = findViewById(R.id.btn24);
        b25 = findViewById(R.id.btn25);
        timer=(TextView) findViewById(R.id.timer);
        cr = findViewById(R.id.correct);
        incr = findViewById(R.id.incorr);
    }
}
