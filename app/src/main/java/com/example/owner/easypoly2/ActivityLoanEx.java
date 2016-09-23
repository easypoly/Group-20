package com.example.owner.easypoly2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLoanEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_ex);

        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/iskpota.ttf");

        TextView tv=(TextView)findViewById(R.id.textView5);
        tv.setTypeface(face);

        TextView tv2=(TextView)findViewById(R.id.textView26);
        tv2.setTypeface(face);

        TextView tv3=(TextView)findViewById(R.id.textView8);
        tv3.setTypeface(face);

        TextView tv4=(TextView)findViewById(R.id.textView9);
        tv4.setTypeface(face);

        TextView tv5=(TextView)findViewById(R.id.textView10);
        tv5.setTypeface(face);

        TextView tv6=(TextView)findViewById(R.id.textView11);
        tv6.setTypeface(face);

        TextView tv7=(TextView)findViewById(R.id.textView12);
        tv7.setTypeface(face);
        TextView tv8=(TextView)findViewById(R.id.textView22);
        tv8.setTypeface(face);

        TextView tv15=(TextView)findViewById(R.id.textView7);
        tv15.setTypeface(face);

        TextView tv16=(TextView)findViewById(R.id.textView27);
        tv16.setTypeface(face);

        TextView tv17=(TextView)findViewById(R.id.textView28);
        tv17.setTypeface(face);
        TextView tv18=(TextView)findViewById(R.id.textView29);
        tv18.setTypeface(face);

        TextView tv19=(TextView)findViewById(R.id.textView30);
        tv19.setTypeface(face);

        TextView tv20=(TextView)findViewById(R.id.textView31);
        tv20.setTypeface(face);



        Button tvb= (Button) findViewById(R.id.button);
        tvb.setTypeface(face);
    }



    public void add(View view){

        EditText totalv= (EditText)findViewById(R.id.totalv);
        EditText interest= (EditText)findViewById(R.id.interest);
        EditText terms= (EditText)findViewById(R.id.terms);
        EditText value= (EditText)findViewById(R.id.value);

        Double total     = Double.valueOf(totalv.getText().toString());
        Double rate      = Double.valueOf(interest.getText().toString());;
        Double term    = Double.valueOf(terms.getText().toString());

        Double v = (1.0+(rate/1200.0));
        Double t = (-(term/12.0)*12.0);
        Double result=(total*(rate/1200.0))/(1.0-Math.pow(v,t));
        value.setText(String.format("%.2f", result));


    }



}
