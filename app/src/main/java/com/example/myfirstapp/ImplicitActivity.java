package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        final EditText etWebsite =findViewById(R.id.editText);
        final EditText etPhoneNumber=findViewById(R.id.phoneNumber);
        final EditText etMessage=findViewById(R.id.message);
        Button button=findViewById(R.id.button);
        Button btnCall=findViewById(R.id.btnCall);
        Button btnSend=findViewById(R.id.btnSend);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                String url= etWebsite.getText().toString();
                if(!url.contains("http")){
                    url ="http://"+url;
                }

                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=etPhoneNumber.getText().toString();
                Intent intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+number));
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Log.e("Implicit Intent","No app can handle this ACTION_DIAL");
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ImplicitActivity.this,
                        SendActivity.class);
                String smg=etMessage.getText().toString();
                intent.putExtra("message",smg);
                startActivity(intent);
            }
        });
    }
}
