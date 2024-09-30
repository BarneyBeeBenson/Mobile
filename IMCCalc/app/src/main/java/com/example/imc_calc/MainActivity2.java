package com.example.imc_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView alt;
        TextView pes;
        TextView resul;

        alt = findViewById(R.id.textViewAlt0);
        pes = findViewById(R.id.textPes0);
        resul = findViewById(R.id.textViewIMC2);

        Intent i = getIntent();
        Bundle b = i.getExtras();



        Float peso = b.getFloat("peso");
        Float altura = b.getFloat("altura");
        Float imc = b.getFloat("IMC");

        alt.setText(String.valueOf(altura));
        pes.setText(String.valueOf(peso));
        resul.setText(String.valueOf(imc));


        ImageView imageView = findViewById(R.id.imageView2);


        if (imc < 18.5) {
            imageView.setImageResource(R.drawable.abaixopeso);
        } else if (imc < 24.9) {
            imageView.setImageResource(R.drawable.normal);
        } else if (imc < 29.9) {
            imageView.setImageResource(R.drawable.sobrepeso);
        } else if (imc < 34.9) {
            imageView.setImageResource(R.drawable.obesidade1);
        } else if (imc < 39.9) {
            imageView.setImageResource(R.drawable.obesidade2);
        } else {
            imageView.setImageResource(R.drawable.obesidade3);
        }
    }



    }
