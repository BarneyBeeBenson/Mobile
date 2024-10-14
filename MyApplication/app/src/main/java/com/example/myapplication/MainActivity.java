package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        DAOPlaneta daoPlaneta = new DAOPlaneta();
        PlanetaAdapter planetaAdapter = new PlanetaAdapter(this, R.layout.item_planeta, daoPlaneta.getPlanetas());
        listView.setAdapter(planetaAdapter);


        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //@Override
            //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(getApplicationContext(), Integer.toString(i) + nomes[i], Toast.LENGTH_LONG).show();
           // }
       // });
    }
}