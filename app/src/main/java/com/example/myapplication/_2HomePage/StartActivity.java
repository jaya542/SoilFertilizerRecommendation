package com.example.myapplication._2HomePage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication._3FarmerDetails.DetailsActivity;
import com.example.myapplication.MainActivity;
import com.example.myapplication._6Message.ContactActivity;
import com.example.myapplication.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_home);
        Button b1 =(Button) findViewById(R.id.start);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( StartActivity.this , DetailsActivity.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.trans);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( StartActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

        Button b3 =(Button) findViewById(R.id.contact);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( StartActivity.this , ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}