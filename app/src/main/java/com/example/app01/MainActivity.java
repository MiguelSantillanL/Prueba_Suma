package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1_Dato1;
    private EditText et2_Dato2;
    private TextView tv2_Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1_Dato1 = findViewById(R.id.et1_Dato1);
        et2_Dato2 = findViewById(R.id.et2_Dato2);
        tv2_Result = findViewById(R.id.tv2_Result);
    }
    public void  Sumar(View view){
        int dato1,dato2, r;
        String aux;
        aux = et1_Dato1.getText().toString();
        dato1 = Integer.parseInt(aux);
        dato2 = Integer.parseInt(et2_Dato2.getText().toString());
        r = dato1 + dato2;
        aux = String.valueOf(r);
        tv2_Result.setText(aux);
    }
}