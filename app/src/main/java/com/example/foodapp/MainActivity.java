package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        login = findViewById(R.id.login_btn);
        register= findViewById(R.id.register_btn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_1 = new Intent(MainActivity.this, SignInActivity.class );

                startActivity(intent_1);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_2 = new Intent(MainActivity.this, SignUpActivity.class );

                startActivity(intent_2);
            }
        });




    }

}
