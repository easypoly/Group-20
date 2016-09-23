package com.example.owner.easypoly2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/iskpota.ttf");

        TextView tv=(TextView)findViewById(R.id.textView18);
        tv.setTypeface(face);

        TextView tv1=(TextView)findViewById(R.id.textView19);
        tv1.setTypeface(face);


        Button btnLoan=(Button)findViewById(R.id.button);
        btnLoan.setTypeface(face);

        btnLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),ActivityLoanEx.class);
                startActivity(intent1);

            }
        });

        Button btnFixed=(Button)findViewById(R.id.button2);
        btnFixed.setTypeface(face);

        btnFixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),ActivityDepositEx.class);
                startActivity(intent2);

            }
        });

        Button btnFixedfuture=(Button)findViewById(R.id.button3);
        btnFixedfuture.setTypeface(face);

        btnFixedfuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),ActivityFV.class);
                startActivity(intent3);

            }
        });



        Button btnSavings=(Button)findViewById(R.id.button4);
        btnSavings.setTypeface(face);

        btnSavings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),ActivitySavings.class);
                startActivity(intent4);

            }
        });




    }
}
