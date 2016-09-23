package com.example.owner.easypoly2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityFV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fv);

        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/iskpota.ttf");

        TextView tv=(TextView)findViewById(R.id.textView5);
        tv.setTypeface(face);

        TextView tv2=(TextView)findViewById(R.id.textView6);
        tv2.setTypeface(face);

        TextView tv3=(TextView)findViewById(R.id.textView13);
        tv3.setTypeface(face);

        TextView tv4=(TextView)findViewById(R.id.textView14);
        tv4.setTypeface(face);

        TextView tv5=(TextView)findViewById(R.id.textView15);
        tv5.setTypeface(face);

        TextView tv6=(TextView)findViewById(R.id.textView16);
        tv6.setTypeface(face);

        TextView tv7=(TextView)findViewById(R.id.textView17);
        tv7.setTypeface(face);

        TextView tv8=(TextView)findViewById(R.id.textView23);
        tv8.setTypeface(face);

        Button tvb= (Button) findViewById(R.id.button);
        tvb.setTypeface(face);
    }



    public void add(View view){


        EditText editText= (EditText)findViewById(R.id.editText5);
        EditText editText2= (EditText)findViewById(R.id.editText6);
        EditText editText7= (EditText)findViewById(R.id.editText7);
        EditText editText4= (EditText)findViewById(R.id.editText8);



        Double total     = Double.valueOf(editText7.getText().toString());
        Double rate      = Double.valueOf(editText.getText().toString());;
        Double term    = Double.valueOf(editText2.getText().toString());


        Double result=total * Math.pow((1 + rate/100.0), term/12);


        editText4.setText(String.format("%.2f", result));


    }
}
