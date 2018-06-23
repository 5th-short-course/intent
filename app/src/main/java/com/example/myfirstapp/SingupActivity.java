package com.example.myfirstapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SingupActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView textView=findViewById(R.id.textView2);
        String signup= getResources().getString(R.string.Signup_label);
        textView.setText(signup);
        getResources().getDrawable(R.drawable.ic_launcher);

    }
}
