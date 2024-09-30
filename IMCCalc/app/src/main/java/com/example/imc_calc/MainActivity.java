package com.example.imc_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float altura;
    float peso;
    float imc;
    EditText tAltura;
    EditText tPeso;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tAltura = findViewById(R.id.editTextAltura);
        tPeso = findViewById(R.id.editTextPeso);
        b = findViewById(R.id.buttonCalc);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tAltura.getText();
                tPeso.getText();
                altura = Float.parseFloat(String.valueOf(tAltura.getText().toString()));
                peso = Float.parseFloat(String.valueOf(tPeso.getText().toString()));

                imc  = peso / (altura * altura);

                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                intent.putExtra("IMC", imc);
                intent.putExtra("altura", altura);
                intent.putExtra("peso", peso);
                startActivity(intent);
            }
        });


    }
}