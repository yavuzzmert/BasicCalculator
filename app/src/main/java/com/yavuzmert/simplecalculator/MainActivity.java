package com.yavuzmert.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1T;
    EditText number2T;
    TextView resultT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1T = findViewById(R.id.number1Text);
        number2T = findViewById(R.id.number2Text);
        resultT = findViewById(R.id.resultText);

    }



    public void sum(View view){

        if(number1T.getText().toString().matches("") || number2T.getText().toString().matches(""))
        {
            resultT.setText("Enter Number!");
        } else {

            String myString = number1T.getText().toString();
            int number1 = Integer.parseInt(myString);

            int number2 = Integer.parseInt(number2T.getText().toString());

            int result = number1 + number2;

            resultT.setText("Result: " + result) ;
        }

    }

    public void deductNumbers(View view){

        if(number1T.getText().toString().matches("") || number2T.getText().toString().matches(""))
        {
            resultT.setText("Enter Number!");
        } else {
            int number1 = Integer.parseInt( number1T.getText().toString());
            int number2 = Integer.parseInt( number2T.getText().toString());

            int result = number1 - number2;

            resultT.setText("Result: " + result);
        }

    }

    public void multiplyNumber(View view){
        if(number1T.getText().toString().matches("") || number2T.getText().toString().matches(""))
        {
            resultT.setText("Enter Number!");
        } else {
        int input1 = Integer.parseInt( number1T.getText().toString());
        int input2 = Integer.parseInt( number2T.getText().toString());

        int result = input1 * input2;
        resultT.setText("Result: " + result);
        }
    }

    public void  divideNumbers(View view){
        if(number1T.getText().toString().matches("") || number2T.getText().toString().matches(""))
        {
            resultT.setText("Enter Number!");
        } else {

            int number1 = Integer.parseInt(number1T.getText().toString());
            int number2 = Integer.parseInt(number2T.getText().toString());

            int result = number1 / number2;

            resultT.setText("Result: " + result);
        }
    }

}