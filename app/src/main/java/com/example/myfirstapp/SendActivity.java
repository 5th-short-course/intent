package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        TextView tvMessage=findViewById(R.id.tvMessage);

        Intent intent =getIntent();
        if(intent!=null){
            String message =intent.getStringExtra("message");
            tvMessage.setText(message);
        }
    }
}
