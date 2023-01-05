package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication._2HomePage.StartActivity;
import com.example.myapplication._2HomePage.StartActivityTelugu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_main);

        Button b1 =(Button) findViewById(R.id.eng);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent packageContext;
                Intent intent = new Intent( MainActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });


        Button b2 =(Button) findViewById(R.id.tel);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent packageContext;
                Intent intent = new Intent( MainActivity.this , StartActivityTelugu.class);
                startActivity(intent);
            }
        });

    }
}