package com.example.myapplication;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {


    SensorManager mSensorManager;
    SensorManager mSensorLuz;
    Sensor mSensor;
    TextView textView;
    TextView textView2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textView= findViewById(R.id.textView);
        textView2= findViewById(R.id.textView3);
        textView3= findViewById(R.id.textView4);
        mSensor= mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        mSensorManager.registerListener(this,mSensor,SensorManager.SENSOR_DELAY_NORMAL);
    }





    @Override
    public void onSensorChanged(SensorEvent event) {
        float dado1= event.values[0];
        float dado2= event.values[1];
        float dado3= event.values[2];

        textView.setText(Float.toString(dado1));
        textView2.setText(Float.toString(dado2));
        textView3.setText(Float.toString(dado3));

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}