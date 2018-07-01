package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddArticleActivity extends AppCompatActivity {

    private EditText title,content;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_article);

        title =findViewById(R.id.title);
        content=findViewById(R.id.content);
        btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent();
                intent.putExtra("title",title.getText().toString());
                intent.putExtra("content",content.getText().toString());
                setResult(RESULT_OK,intent);

                finish();
            }
        });

    }
}
