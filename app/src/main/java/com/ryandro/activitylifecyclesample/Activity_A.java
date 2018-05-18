package com.ryandro.activitylifecyclesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity_A extends AppCompatActivity {
    String TAG = Activity_A.class.getSimpleName();

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    DateFormat dateFormat1 = new SimpleDateFormat("HH:MM:SS");
    DateFormat dateFormatDate = new SimpleDateFormat("dd/MM/YYYY");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, dateFormat.format(date) + " OnCreate Method is Called");
        Button btn_clickMe = findViewById(R.id.btn_clickMe);
        // for all coding perpose we will use this oncreate method
        btn_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_A.this, Activity_B.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, dateFormat1.format(date) + " OnStart Method is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "OnResume Method is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause Method is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop Method is Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart Method is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy Method is Called");

    }
}
