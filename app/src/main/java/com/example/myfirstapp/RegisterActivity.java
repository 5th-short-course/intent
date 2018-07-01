package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText etUser,etAge,etGender,etDob;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //create view objects
        etUser=findViewById(R.id.name);
        etAge=findViewById(R.id.age);
        etGender=findViewById(R.id.gender);
        etDob=findViewById(R.id.dob);
        btnSave=findViewById(R.id.btnSave);
        //-------------------------------------------

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RegisterActivity.this,
                        UserInfoActivity.class);
                Bundle bundle=new Bundle();
                bundle.putParcelable("data",getUserForm());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    public User getUserForm(){

        //get values from editText
        String name=etUser.getText().toString();
        //convert age to integer
        int age= Integer.parseInt(etAge.getText().toString());
        String gender=etGender.getText().toString();
        String dob=etDob.getText().toString();
        //-------------------------------------------------

        User user=new User();
        user.setName(name);
        user.setGender(gender);
        user.setAge(age);
        user.setDob(dob);

        return user;
    }

}
