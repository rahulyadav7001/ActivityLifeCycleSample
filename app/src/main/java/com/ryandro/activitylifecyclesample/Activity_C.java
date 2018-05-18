package com.ryandro.activitylifecyclesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity_C extends AppCompatActivity {
    String TAG = Activity_C.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c);
        Log.d(TAG, "OnCreate Method is Called");

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
