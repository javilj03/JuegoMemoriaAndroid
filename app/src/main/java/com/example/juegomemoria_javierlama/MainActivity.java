package com.example.juegomemoria_javierlama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        btn7 = (ImageButton) findViewById(R.id.btn7);
        btn8 = (ImageButton) findViewById(R.id.btn8);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

    }
    //Crear funcion
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn1:
                girarCarta(1);
                break;
            case R.id.btn2:
                girarCarta(2);
                break;
            case R.id.btn3:
                girarCarta(3);
                break;
            case R.id.btn4:
                girarCarta(4);
                break;
            case R.id.btn5:
                girarCarta(5);
                break;
            case R.id.btn6:
                girarCarta(6);
                break;
            case R.id.btn7:
                girarCarta(7);
                break;
            case R.id.btn8:
                girarCarta(8);
                break;
        }
    }
    public void girarCarta(int i){


    }
}