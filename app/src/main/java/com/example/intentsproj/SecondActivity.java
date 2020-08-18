package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {


    private EditText opr1;
    private EditText opr2;
    protected Button btnadd;
    protected Button btnsub;
    protected Button btnmul;
    protected Button btndiv;
    private TextView txtresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(MainActivity.Extra_Number1,0);
        int number2 = intent.getIntExtra(MainActivity.Extra_Number2,0);

        EditText num1 = (EditText)findViewById(R.id.num1) ;
        EditText num2 = (EditText)findViewById(R.id.num2) ;

        num1.setText("" +number1);
        num2.setText("" +number2);



        opr1   = (EditText) findViewById(R.id.num1);
        opr2   = (EditText) findViewById(R.id.num2);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        txtresult= (TextView) findViewById(R.id.txtresult);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double no1 = Double.parseDouble(opr1.getText().toString());
                    double no2 = Double.parseDouble(opr2.getText().toString());
                    double results = no1 + no2;
                    txtresult.setText(Double.toString(results));
                }

            }
        });



        btnsub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double no1 = Double.parseDouble(opr1.getText().toString());
                    double no2 = Double.parseDouble(opr2.getText().toString());
                    double results = no1 - no2;
                    txtresult.setText(Double.toString(results));
                }

            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double no1 = Double.parseDouble(opr1.getText().toString());
                    double no2 = Double.parseDouble(opr2.getText().toString());
                    double results = no1 * no2;
                    txtresult.setText(Double.toString(results));
                }

            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double no1 = Double.parseDouble(opr1.getText().toString());
                    double no2 = Double.parseDouble(opr2.getText().toString());
                    double results = no1 / no2;
                    txtresult.setText(Double.toString(results));
                }

            }
        });


    }
}