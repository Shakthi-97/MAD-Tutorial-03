package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String Extra_Number1 = "com.IntentsProj.application.IntentsProj.Extra_Number1";
    public static final String Extra_Number2 = "com.IntentsProj.application.IntentsProj.Extra_Number2";

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
                showToast();
            }

            public void openSecondActivity() {

                EditText num1 = (EditText)findViewById(R.id.num1) ;
                int number1 = Integer.parseInt(num1.getText().toString());

                EditText num2 = (EditText)findViewById(R.id.num2) ;
                int number2 = Integer.parseInt(num2.getText().toString());

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra(Extra_Number1,number1);
                intent.putExtra(Extra_Number2,number2);
                startActivity(intent);

            }

            private void showToast() {           

                Toast toast = Toast.makeText(MainActivity.this, "You just clicked the OK button", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();

                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

                Toast toast1 = new Toast(getApplicationContext());
                toast1.setDuration(Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.BOTTOM, 0, 0);
                toast1.setView(layout);
                toast1.show();
            }


        });

    }


}

///




