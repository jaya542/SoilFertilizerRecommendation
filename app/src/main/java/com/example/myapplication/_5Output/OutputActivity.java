package com.example.myapplication._5Output;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication._3FarmerDetails.DetailsActivity;
import com.example.myapplication.R;
import com.example.myapplication._2HomePage.StartActivity;

public class OutputActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22,tv30,tn1,tn2,tn3,tp1,tk1,tk2,tk3,tas1,tas2,tu3,tdi1,tps1,tps2,tps3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_output);

        tv1=findViewById( R.id.tv1);
        tv2=findViewById( R.id.tv2);
        tv3=findViewById( R.id.tv3);
        tv4=findViewById( R.id.tv4);
        tv13=findViewById( R.id.tv13);
        tv14=findViewById( R.id.tv14);
        tv15=findViewById( R.id.tv15);
        tv16=findViewById( R.id.tv16);
        tv17=findViewById( R.id.tv17);
        tv18=findViewById( R.id.tv18);
        tv19=findViewById( R.id.tv19);
        tv20=findViewById( R.id.tv20);
        tv21=findViewById( R.id.tv21);
        tv22=findViewById( R.id.tv22);
        tv30=findViewById(R.id.tv30);

        tn1=findViewById( R.id.tn1);
        tn2=findViewById( R.id.tn2);
        tn3=findViewById( R.id.tn3);
        tp1=findViewById( R.id.tp1);
        tk1=findViewById( R.id.tk1);
        tk2=findViewById( R.id.tk2);
        tk3=findViewById( R.id.tk3);
        tas1=findViewById( R.id.tas1);
        tas2=findViewById( R.id.tas2);
        tu3=findViewById( R.id.tu3);
        tdi1=findViewById( R.id.tdi1);
        tps1=findViewById( R.id.tps1);
        tps2=findViewById( R.id.tps2);
        tps3=findViewById( R.id.tps3);

        tv1.setText(getIntent().getExtras().getString("farmerName"));
        tv2.setText(getIntent().getExtras().getString("surveyNo"));
        tv3.setText(getIntent().getExtras().getString("villageName"));
        tv4.setText(getIntent().getExtras().getString("auctionPlat"));
        tv13.setText(getIntent().getExtras().getString("ocValue"));
        tv14.setText(getIntent().getExtras().getString("phValue"));
        tv15.setText(getIntent().getExtras().getString("ecValue"));
        tv16.setText(getIntent().getExtras().getString("nValue"));
        tv17.setText(getIntent().getExtras().getString("pValue"));
        tv18.setText(getIntent().getExtras().getString("kValue"));

        tv19.setText(getIntent().getExtras().getString("yieldTarget"));
        tv20.setText(getIntent().getExtras().getString("N"));
        tv21.setText(getIntent().getExtras().getString("P"));
        tv22.setText(getIntent().getExtras().getString("K"));

        tn1.setText(getIntent().getExtras().getString("tn11"));
        tp1.setText(getIntent().getExtras().getString("tp11"));
        tk1.setText(getIntent().getExtras().getString("tk11"));

        tn2.setText(getIntent().getExtras().getString("tn12"));
        tk2.setText(getIntent().getExtras().getString("tk12"));

        tn3.setText(getIntent().getExtras().getString("tn11"));
        tk3.setText(getIntent().getExtras().getString("tk11"));

        tas1.setText(getIntent().getExtras().getString("ta11"));
        tas2.setText(getIntent().getExtras().getString("tas12"));
        tu3.setText(getIntent().getExtras().getString("tu13"));

        tdi1.setText(getIntent().getExtras().getString("tdia"));

        tps1.setText(getIntent().getExtras().getString("tks11"));
        tps2.setText(getIntent().getExtras().getString("tks12"));
        tps3.setText(getIntent().getExtras().getString("tks11"));

        tv30.setText(getIntent().getExtras().getString("oc1"));

        Button b1 =(Button) findViewById(R.id.hom);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( OutputActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.edit);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( OutputActivity.this , DetailsActivity.class);
                startActivity(intent);
            }
        });

        Button b3 =(Button) findViewById(R.id.finish);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( OutputActivity.this , StartActivity.class);
                startActivity(intent);
            }
        });
    }
}