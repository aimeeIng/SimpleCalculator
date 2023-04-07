package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText text1;
    private EditText edittext2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.text1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        result = (TextView) findViewById(R.id.result);
    }
     public  void  btnSum(View view){
        int n1 = Integer.parseInt(text1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int sum = n1 + n2;
        result.setText(String.valueOf(sum));
     }
    public  void  btnSub(View view){
        int n1 = Integer.parseInt(text1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int sub = n1 - n2;
        result.setText(String.valueOf(sub));
    }
    public  void  btnMult(View view){
        int n1 = Integer.parseInt(text1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int mult = n1 * n2;
        result.setText(String.valueOf(mult));
    }
    public  void  btnDiv(View view){
        int n1 = Integer.parseInt(text1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int div = n1 / n2;
        result.setText(String.valueOf(div));
    }
}