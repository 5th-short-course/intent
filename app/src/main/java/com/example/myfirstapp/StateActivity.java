package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StateActivity extends AppCompatActivity {

    void logger(String msm){
        Log.e("TAG",msm);
    }

    void onNewActivity(View view){
        Intent intent=new Intent(StateActivity.this,SingupActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        logger("onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logger("onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger("onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger("onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger("onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger("onDestroy called");
    }

}
