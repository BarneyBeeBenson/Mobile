package com.example.imc_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView alt;
        TextView pes;
        TextView resul;
        TextView mensagem;
        Button btn;

        btn =findViewById(R.id.buttonVoltar);
        alt = findViewById(R.id.textViewAlt0);
        pes = findViewById(R.id.textPes0);
        resul = findViewById(R.id.textViewIMC2);
        mensagem = findViewById(R.id.resultado);

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
            mensagem.setText("Abaixo do peso");
            imageView.setImageResource(R.drawable.abaixopeso);
        } else if (imc < 24.9) {
            imageView.setImageResource(R.drawable.normal);
            mensagem.setText("Normar");
        } else if (imc < 29.9) {
            imageView.setImageResource(R.drawable.sobrepeso);
            mensagem.setText("Sobrepeso");
        } else if (imc < 34.9) {
            imageView.setImageResource(R.drawable.obesidade1);
            mensagem.setText("Obesidade");
        } else if (imc < 39.9) {
            imageView.setImageResource(R.drawable.obesidade2);
            mensagem.setText("Obesidade²");
        } else {
            imageView.setImageResource(R.drawable.obesidade3);
            mensagem.setText("Obesidade³");
        }
        btn.setOnClickListener(new View.OnClickListener(){
            
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(ii);
            }
        });
    }



    }
