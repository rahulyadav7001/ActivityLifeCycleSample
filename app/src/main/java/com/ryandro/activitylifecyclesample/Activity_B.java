package com.ryandro.activitylifecyclesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_B extends AppCompatActivity {
    String TAG = Activity_B.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "OnCreate Method is Called");
        Button btn_clickMe = findViewById(R.id.btn_clickMe);
        // for all coding perpose we will use this oncreate method
        btn_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_B.this,Activity_C.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart Method is Called");
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
