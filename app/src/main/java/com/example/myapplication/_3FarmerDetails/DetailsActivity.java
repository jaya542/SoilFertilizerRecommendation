package com.example.myapplication._3FarmerDetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication._4SoilDetails.SoilActivity;
import com.example.myapplication._2HomePage.StartActivity;

public class DetailsActivity extends AppCompatActivity {
    EditText farmer,village,survey;
    String farmerName,villageName,auctionPlat,surveyNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_details);

        farmer=findViewById(R.id.farmer);
        survey=findViewById(R.id.survey);
        village=findViewById(R.id.village);

        final String[] platNames = {"Devarapalli", "Jangareddygudem-I","Jangareddygudem-II","Koyyalagudem","Goapalapuram"};
        Spinner auction = findViewById(R.id.auction);
        if (auction != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, platNames);
            auction.setAdapter(arrayAdapter);

            auction.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(DetailsActivity.this, getString(R.string.selected_plat) + " " + platNames[position], Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

        Button b1 =(Button) findViewById(R.id.home);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( DetailsActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.back);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( DetailsActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });

        Button b3 =(Button) findViewById(R.id.next);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                farmerName = "Name:  "+farmer.getText().toString();
                surveyNo = "Survey Number:  "+survey.getText().toString();
                villageName = "Village:  "+village.getText().toString();
                auctionPlat = "Auction Platform:  "+auction.getSelectedItem().toString();


                Intent packageContext;
                Intent intent = new Intent( DetailsActivity.this , SoilActivity.class);
                intent.putExtra("farmerName",farmerName);
                intent.putExtra("surveyNo", surveyNo);
                intent.putExtra("villageName",villageName);
                intent.putExtra("auctionPlat",auctionPlat);

                startActivity(intent);
            }
        });
    }
}