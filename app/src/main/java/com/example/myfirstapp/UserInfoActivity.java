package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    private EditText etUser,etAge,etGender,etDob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        etUser=findViewById(R.id.name);
        etAge=findViewById(R.id.age);
        etGender=findViewById(R.id.gender);
        etDob=findViewById(R.id.dob);

        //get data from intent
        Intent intent=getIntent();
        if(intent!=null){
            User user =  intent.getParcelableExtra("data");
            Log.e(TAG, "onCreate: "+ user.toString());
            setUserForm(user);
        }
    }

    void setUserForm(User user){
        if(user!=null){
            etUser.setText(user.getName());
            etGender.setText(user.getGender());
            etAge.setText(user.getAge()+"");
            etDob.setText(user.getDob());
        }else{
            Log.e(TAG, "setUserForm: null object reference");
        }

    }
    private static final String TAG = "UserInfoActivity";

}
