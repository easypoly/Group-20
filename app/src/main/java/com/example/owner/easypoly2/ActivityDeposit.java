package com.example.owner.easypoly2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDeposit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/iskpota.ttf");

        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setTypeface(face);

        TextView tv2=(TextView)findViewById(R.id.textView2);
        tv2.setTypeface(face);

        TextView tv3=(TextView)findViewById(R.id.textView3);
        tv3.setTypeface(face);

        TextView tv4=(TextView)findViewById(R.id.textView4);
        tv4.setTypeface(face);

        Button tvb= (Button) findViewById(R.id.button);
        tvb.setTypeface(face);
    }


    public void add(View view){

        EditText editText= (EditText)findViewById(R.id.editText);
        EditText editText2= (EditText)findViewById(R.id.editText2);
        EditText editText3= (EditText)findViewById(R.id.editText3);
        EditText editText4= (EditText)findViewById(R.id.editText4);



        Double total     = Double.valueOf(editText2.getText().toString());
        Double rate      = Double.valueOf(editText.getText().toString());;
        Double term    = Double.valueOf(editText3.getText().toString());

        Double v = (1.0+(rate/1200.0));
        Double t = ((term/12.0)*12.0);
        Double result=-(total*(rate/1200.0))/(1.0-Math.pow(v,t));


        editText4.setText(result.toString());

    }


}
