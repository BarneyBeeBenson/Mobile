package com.ifsc.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        tv= findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Random
                Random random = new Random();
                Button b =(Button) view;
                int ninicial = 50;
                int nfinal = 100;
                int nsorteio = random.nextInt(nfinal-ninicial)+ ninicial;
                tv.setText(String.valueOf(nsorteio));
            }
        });
    }
}