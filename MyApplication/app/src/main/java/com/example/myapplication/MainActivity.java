package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] nomes = new String[] {"Davy Jones", "Jack Sparrow", "orje Barbosa", "Jonh Butstrap"};

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        DAOPlaneta daoPlaneta = null;
       // PlanetaAdapter planetaAdapter = new PlanetaAdapter(this, R.layout.item_planeta, daoPlaneta.getPlanetas());
        daoPlaneta = new DAOPlaneta();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), Integer.toString(i) + nomes[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}