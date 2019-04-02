package com.example.parthsharma.loginconstrainsts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View theBtn){

        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.SecondNum);

        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());

        Toast.makeText(MainActivity.this,"Sum is :"+ sum , Toast.LENGTH_LONG).show();



    }

    public void Multi(View theBtn){

        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.SecondNum);

        int sum = Integer.parseInt(num1.getText().toString())* Integer.parseInt(num2.getText().toString());

        Toast.makeText(MainActivity.this,"Sum is :"+ sum , Toast.LENGTH_LONG).show();



    }
}
