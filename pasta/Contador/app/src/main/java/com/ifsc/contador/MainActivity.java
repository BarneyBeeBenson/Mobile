package com.ifsc.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont ++;
                Button b =(Button) view;
                TextView teste = (TextView) view;
                teste = findViewById(R.id.textView);
                b.setText(String.valueOf(cont));
                teste.setText(String.valueOf(cont));
            }
        });
    }
}