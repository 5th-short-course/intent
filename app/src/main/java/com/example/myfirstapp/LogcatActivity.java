package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LogcatActivity extends AppCompatActivity {

    private static final String TAG = "LogcatActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);

        Log.v(TAG,"this is log V");
        Log.i(TAG,"this is log info");
        Log.w(TAG,"this is log warning");
        Log.d(TAG,"this is log debug");
        Log.e(TAG,"this is log error");

        Log.d(TAG, "onCreate: ");
        Log.i(TAG, "onCreate: ");

    }
}
