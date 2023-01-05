package com.example.myapplication._4SoilDetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication._2HomePage.StartActivityTelugu;
import com.example.myapplication._3FarmerDetails.DetailsActivity;
import com.example.myapplication._3FarmerDetails.DetailsActivityTelugu;
import com.example.myapplication._5Output.OutputActivity;
import com.example.myapplication.R;
import com.example.myapplication._2HomePage.StartActivity;
import com.example.myapplication._5Output.OutputActivityTelugu;

public class SoilActivityTelugu extends AppCompatActivity {
    EditText oc,ph,ec,n,p,k;
    String ocValue,phValue,ecValue,nValue,pValue,kValue,yieldTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_soil_telugu);

        oc=findViewById(R.id.oc);
        ph=findViewById(R.id.ph);
        ec=findViewById(R.id.ec);
        n=findViewById(R.id.n);
        p=findViewById(R.id.p);
        k=findViewById(R.id.k);


        final String[] yieldNames = {"20","21","22","23","24","25","26","27","28","29","30"};
        Spinner yield = findViewById(R.id.yield);
        if (yield != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, yieldNames);
            yield.setAdapter(arrayAdapter);

            yield.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(SoilActivityTelugu.this, getString(R.string.selected_yield) + " " + yieldNames[position], Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

        Button b1 =(Button) findViewById(R.id.hom);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( SoilActivityTelugu.this , StartActivityTelugu.class);
                startActivity(intent);
            }
        });

        Button b2 =(Button) findViewById(R.id.back);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {

                Intent packageContext;
                Intent intent = new Intent( SoilActivityTelugu.this , DetailsActivityTelugu.class);
                startActivity(intent);
            }
        });

        Button b3 =(Button) findViewById(R.id.next);

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View b) {

                ocValue = "సేంద్రీయ కర్బనం(%): "+oc.getText().toString();
                phValue = "రసాయనిక తత్వము: "+ph.getText().toString();
                ecValue = "లవణీయత సూచిక (డి.ఎస్/ఎం): "+ec.getText().toString();
                nValue = "లభ్య నత్రజని(కిలో/హె):  "+n.getText().toString();
                pValue = "లభ్య భాస్వరం(కిలో/హె): "+p.getText().toString();
                kValue = "లభ్య పొటాషియం(కిలో/హె):  "+k.getText().toString();
                yieldTarget = "లభ్య పొటాషియం(కిలో/హె): "+yield.getSelectedItem().toString();

                Float om = Float.parseFloat(oc.getText().toString());
                String oc1;
                if(om <= 0.4){
                    oc1 = "సేంద్రీయ ఎరువులు:   2.5 టి/హే లేదా పచ్చి ఎరువు";
                }else {
                    oc1 = "సేంద్రియ ఎరువులు: ------";
                }
                String oc11 = String.valueOf(oc1);

                //Target Equations
                Integer stvN = Integer.parseInt(n.getText().toString());
                Integer stvP = Integer.parseInt(p.getText().toString());
                Integer stvK = Integer.parseInt(k.getText().toString());
                Integer T = Integer.parseInt(yield.getSelectedItem().toString());

                // ** FORMULAE **  //
                double Nv = (5.92*T)-(0.34*stvN);
                double Pv = (4.09*T)-(2.89*stvP);
                double Kv = (8.47*T)-(0.35*stvK);

                int N = (int)Nv;
                int P = (int)Pv;
                int K = (int)Kv;

                String Nval = "N:  "+String.valueOf(N);
                String Pval = "P₂O₅:  "+String.valueOf(P);
                String Kval = "K₂O:  "+String.valueOf(K);

                //Fertilizer Recommendation Nutrients
                int tn11 = N/4;
                String tn = "నైట్రోజన్ (N) :"+String.valueOf(tn11);

                int tp11 = P;
                String tp = "భాస్వరం(P2O5) :"+String.valueOf(tp11);

                int tk11 = K/4;
                String tk = "పొటాషియం (K2O) :"+String.valueOf(tk11);

                int tn12 = N/2;
                String tn1 = "నైట్రోజన్ (N) :"+String.valueOf(tn12);

                int tk12 = K/2;
                String tk1 = "పొటాషియం (K2O) :"+String.valueOf(tk12);

                //Fertilizer Dose
                //Nitrogen
                double tas11=0;
                if(tp11<0){
                    double tas = tn11 * 4.76;
                    tas11 = (int) tas;
                }
                else{
                    tas11=(tn11*4.76)-(tp11*0.39);
                }
                int ta11=(int)tas11;
                String as=String.valueOf(ta11);

                double tas22 = tn12*4.76;
                int tas12=(int)tas22;
                String as22 = String.valueOf(tas12);

                double tu33 = tn11*2.1;
                int tu13=(int)tu33;
                String urea33 = String.valueOf(tu13);

                //phos
                double tdia=0;
                if(tp11>0) {
                    tdia = tp11 * 2.17;
                }
                else if(tp11>=-10){
                    tdia = 15;
                }
                else if(tp11>=-20){
                    tdia = 10;
                }
                else{
                    tdia = 0;
                }
                int td1=(int)tdia;
                String tdi = String.valueOf(td1);

                //potas
                double tks = tk11*2.22;
                int tks11=(int)tks;
                String ks = String.valueOf(tks11);

                double tks22 = tk12*2.22;
                int tks12=(int)tks22;
                String ks22 = String.valueOf(tks12);

                Intent packageContext;
                //Farmer Details
                Intent intent = getIntent();
                String farmerName = intent.getStringExtra("farmerName");
                String villageName = intent.getStringExtra("villageName");
                String auctionPlat = intent.getStringExtra("auctionPlat");
                String surveyNo = intent.getStringExtra("surveyNo");

                Intent intent2 = new Intent( SoilActivityTelugu.this , OutputActivityTelugu.class);
                //Farmer Details
                intent2.putExtra("farmerName",farmerName);
                intent2.putExtra("villageName",villageName);
                intent2.putExtra("auctionPlat",auctionPlat);
                intent2.putExtra("surveyNo",surveyNo);
                //Soil Details
                intent2.putExtra("ocValue",ocValue);
                intent2.putExtra("phValue",phValue);
                intent2.putExtra("ecValue",ecValue);
                intent2.putExtra("nValue",nValue);
                intent2.putExtra("pValue",pValue);
                intent2.putExtra("kValue",kValue);
                //Nutrient Recommendation
                intent2.putExtra("yieldTarget",yieldTarget);
                intent2.putExtra("N",Nval);
                intent2.putExtra("P",Pval);
                intent2.putExtra("K",Kval);
                //Fertilizer Recommendation
                intent2.putExtra("tn11",tn);
                intent2.putExtra("tp11",tp);
                intent2.putExtra("tk11",tk);
                intent2.putExtra("tn12",tn1);
                intent2.putExtra("tk12",tk1);

                intent2.putExtra("ta11",as);
                intent2.putExtra("tas12",as22);
                intent2.putExtra("tu13",urea33);

                intent2.putExtra("tdia",tdi);

                intent2.putExtra("tks11",ks);
                intent2.putExtra("tks12",ks22);

                intent2.putExtra("oc1",oc11);

                startActivity(intent2);
            }
        });
    }
}