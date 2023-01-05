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
import com.example.myapplication._2HomePage.StartActivityTelugu;
import com.example.myapplication._4SoilDetails.SoilActivityTelugu;

public class DetailsActivityTelugu extends AppCompatActivity {
    EditText farmer,village,survey;
    String farmerName,villageName,auctionPlat,surveyNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_details_telugu);

        farmer=findViewById(R.id.farmer);
        survey=findViewById(R.id.survey);
        village=findViewById(R.id.village);

        final String[] platNames = {"దేవరపల్లి", "జంగారెడ్డిగూడెం-I","జంగారెడ్డిగూడెం-II","కొయ్యలగూడెం","గోపాలపురం"};
        Spinner auction = findViewById(R.id.auction);
        if (auction != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, platNames);
            auction.setAdapter(arrayAdapter);

            auction.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(DetailsActivityTelugu.this, getString(R.string.selected_plat) + " " + platNames[position], Toast.LENGTH_SHORT).show();
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
                Intent intent = new Intent( DetailsActivityTelugu.this , StartActivityTelugu.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.back);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( DetailsActivityTelugu.this , StartActivityTelugu.class);
                startActivity(intent);
            }
        });

        Button b3 =(Button) findViewById(R.id.next);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                farmerName = "రైతు వివరాలు: "+farmer.getText().toString();
                surveyNo = "సర్వే. సంఖ్య:  "+survey.getText().toString();
                villageName = "గ్రామం:  "+village.getText().toString();
                auctionPlat = "వేలం వేదిక: "+auction.getSelectedItem().toString();


                Intent packageContext;
                Intent intent = new Intent( DetailsActivityTelugu.this , SoilActivityTelugu.class);
                intent.putExtra("farmerName",farmerName);
                intent.putExtra("surveyNo", surveyNo);
                intent.putExtra("villageName",villageName);
                intent.putExtra("auctionPlat",auctionPlat);

                startActivity(intent);
            }
        });
        //
    }
}