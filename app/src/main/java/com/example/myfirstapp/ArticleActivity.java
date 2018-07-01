package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    private TextView title,content;
    private Button btnAddNewArticle;
    static  final  int REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        title=findViewById(R.id.tvTitle);
        content=findViewById(R.id.tvContent);
        btnAddNewArticle=findViewById(R.id.btnAddArticle);

        btnAddNewArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArticleActivity.this,
                        AddArticleActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            title.setText(data.getStringExtra("title"));
            content.setText(data.getStringExtra("content"));
        }

    }
}
