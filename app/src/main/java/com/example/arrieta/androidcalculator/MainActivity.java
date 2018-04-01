package com.example.arrieta.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonC;
    Button buttonDivide;
    Button buttonMultiply;
    Button buttonDelete;
    Button buttonSubtract;
    Button buttonDot ;
    Button buttonPlusMinor;
    Button buttonAdd ;
    Button buttonEqual;
    Button buttonParenthesis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button0 = (Button)findViewById(R.id.button0);
        this.button1 = (Button)findViewById(R.id.button1);
        this.button2 = (Button)findViewById(R.id.button2);
        this.button3 = (Button)findViewById(R.id.button3);
        this.button4 = (Button)findViewById(R.id.button4);
        this.button5 = (Button)findViewById(R.id.button5);
        this.button6 = (Button)findViewById(R.id.button6);
        this.button7 = (Button)findViewById(R.id.button7);
        this.button8 = (Button)findViewById(R.id.button8);
        this.button9 = (Button)findViewById(R.id.button9);
        this.buttonC = (Button)findViewById(R.id.buttonC);
        this.buttonDivide = (Button)findViewById(R.id.buttonDivide);
        this.buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        this.buttonDelete = (Button)findViewById(R.id.buttonDelete);
        this.buttonSubtract= (Button)findViewById(R.id.buttonSubtract);
        this.buttonDot = (Button)findViewById(R.id.buttonDot);
        this.buttonPlusMinor = (Button)findViewById(R.id.buttonPlusMinor);
        this.buttonAdd = (Button)findViewById(R.id.buttonAdd);
        this.buttonEqual= (Button)findViewById(R.id.buttonEqual);
        this.buttonParenthesis = (Button)findViewById(R.id.buttonParenthesis);

        this.button0.setOnClickListener(this);
        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);
        this.button3.setOnClickListener(this);
        this.button4.setOnClickListener(this);
        this.button5.setOnClickListener(this);
        this.button6.setOnClickListener(this);
        this.button7.setOnClickListener(this);
        this.button8.setOnClickListener(this);
        this.button9.setOnClickListener(this);
        this.buttonC.setOnClickListener(this);
        this.buttonDivide.setOnClickListener(this);
        this.buttonMultiply.setOnClickListener(this);
        this.buttonDelete.setOnClickListener(this);
        this.buttonSubtract.setOnClickListener(this);
        this.buttonDot.setOnClickListener(this);
        this.buttonPlusMinor.setOnClickListener(this);
        this.buttonAdd.setOnClickListener(this);
        this.buttonEqual.setOnClickListener(this);
        this.buttonParenthesis.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {

    }
}
