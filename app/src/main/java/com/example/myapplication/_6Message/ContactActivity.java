package com.example.myapplication._6Message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication._2HomePage.StartActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_contact);

        Button b1 =(Button) findViewById(R.id.start);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( ContactActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.hom);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( ContactActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });
    }
}