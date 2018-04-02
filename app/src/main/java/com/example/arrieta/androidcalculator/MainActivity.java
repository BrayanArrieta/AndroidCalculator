package com.example.arrieta.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
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

    Integer number1;
    Integer number2;
    Boolean isAdd=false, isSubtract=false, isDivide=false,isMultiply=false;
    Boolean passError=false;
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

        this.textView=(TextView)findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        if (passError){
            clear();
            clearTextView();
        }
        String content=this.textView.getText().toString();
        switch (view.getId()){
            case R.id.button0:
                break;
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                String digit=content+((Button)findViewById(view.getId())).getText();
                this.textView.setText(digit);
                break;
            case R.id.buttonC:
                clear();
                break;
            case R.id.buttonAdd:
                add();
                break;
            case R.id.buttonDivide:
                divide();
                break;
            case R.id.buttonDelete:
                if(this.textView.getText().length()>0){
                    this.textView.setText(content.substring(0, content.length() - 1));
                }
                break;
            case R.id.buttonDot:
                break;
            case R.id.buttonSubtract:
                subtract();
                break;
            case R.id.buttonParenthesis:
                break;
            case R.id.buttonPlusMinor:
                break;
            case R.id.buttonEqual:
                calculate();
                break;
            case R.id.buttonMultiply:
                multiply();
                break;
        }
    }
    private void add(){
        this.number1=Integer.parseInt(this.textView.getText().toString());
        this.textView.setText("");
        this.isAdd=true;
    }
    private void subtract(){
        this.number1=Integer.parseInt(this.textView.getText().toString());
        this.textView.setText("");
        this.isSubtract=true;
    }
    private void multiply(){
        this.number1=Integer.parseInt(this.textView.getText().toString());
        this.textView.setText("");
        this.isMultiply=true;
    }
    private void divide(){
        this.number1=Integer.parseInt(this.textView.getText().toString());
        this.textView.setText("");
        this.isDivide=true;
    }
    private void clear(){
        this.number1=null;
        this.number2=null;
        this.isDivide=false;
        this.isMultiply=false;
        this.isAdd=false;
        this.isSubtract=false;

        this.passError=false;
    }
    private void clearTextView(){
        this.textView.setText("");
    }
    private void calculate(){
        if (this.textView.getText().length()==0)
            return;
        try{
            if (isSubtract){
                this.number2=Integer.parseInt(this.textView.getText().toString());
                this.textView.setText(String.valueOf(number1-number2));
            }else if(isDivide){
                this.number2=Integer.parseInt(this.textView.getText().toString());
                this.textView.setText(String.valueOf(number1/number2));
            }else if (isAdd){
                this.number2=Integer.parseInt(this.textView.getText().toString());
                this.textView.setText(String.valueOf(number1+number2));
            }else if (isMultiply){
                this.number2=Integer.parseInt(this.textView.getText().toString());
                this.textView.setText(String.valueOf(number1*number2));
            }
            clear();
        }catch (Exception e){
            this.passError=true;
            this.textView.setText("Error");
        }

    }
}
