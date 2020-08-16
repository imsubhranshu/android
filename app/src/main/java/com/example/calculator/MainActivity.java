package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView disp;
    Button btnadd, btnmult, btnsubt, btndiv, btnrem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);

        disp = (TextView) findViewById(R.id.disp);

        btnadd = (Button) findViewById(R.id.btnadd);
        btnsubt = (Button) findViewById(R.id.btnsub);
        btnmult = (Button) findViewById(R.id.btnmult);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnrem = (Button) findViewById(R.id.btnrem);




    }

    public void add(View view){

        float a = 0,b = 0;
        try {
            a = Float.parseFloat(e1.getText().toString().trim());
            b = Float.parseFloat(e2.getText().toString().trim());
        } catch (Exception e) {
            System.out.println("Empty Strings encountered");
        }

        float c = a + b;

        String result = "The Addition is: " + c;

        disp.setVisibility(View.VISIBLE);
        disp.setText(result);
        System.out.println(result);
    }

    public void sub(View view){
        float a = 0,b = 0;
        try {
            a = Float.parseFloat(e1.getText().toString().trim());
            b = Float.parseFloat(e2.getText().toString().trim());
        } catch (Exception e) {
            System.out.println("Empty Strings encountered");
        }

        float c = a - b;

        String result = "The Subtraction is: " + c;

        disp.setVisibility(View.VISIBLE);
        disp.setText(result);
        System.out.println(result);
    }

    public void mul(View view){
        float a = 0,b = 0;
        try {
            a = Float.parseFloat(e1.getText().toString().trim());
            b = Float.parseFloat(e2.getText().toString().trim());
        } catch (Exception e) {
            System.out.println("Empty Strings encountered");
        }
        float c = a * b;

        String result = "The Multiplication is: " + c;

        disp.setVisibility(View.VISIBLE);
        disp.setText(result);
        System.out.println(result);
    }

    public void div(View view){

        String result;
        float a = 0,b = 0;
        try {
            a = Float.parseFloat(e1.getText().toString().trim());
            b = Float.parseFloat(e2.getText().toString().trim());
        } catch (Exception e) {
            System.out.println("Empty Strings encountered");
        }
        try {

            float c = a / b;
            result = "The Addition is: " + c;

        } catch (Exception e) {

            result = "Could not Divide the given Numbers";
            e.printStackTrace();

        }

        disp.setVisibility(View.VISIBLE);
        disp.setText(result);
        System.out.println(result);
    }

    public void rem(View view){
        float a = Float.parseFloat(e1.getText().toString().trim());
        float b = Float.parseFloat(e2.getText().toString().trim());

        float c = a % b;

        String result = "The Addition is: " + c;
        disp.setText(result);

        System.out.println(result);
    }
}