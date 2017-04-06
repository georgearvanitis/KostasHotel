package com.example.soliton.myapplicationkostashotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButtonListenerMethod();



    }

    private void myButtonListenerMethod() {


        Button button=(Button)findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg=(RadioGroup)findViewById(R.id.radiogroup);

                int radiobuttonid=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(radiobuttonid);

                String category=(String) rb.getText();
                double xrewsh=0;
                EditText staydaysText=(EditText)findViewById(R.id.daysEditText);
                String stayDaysString=staydaysText.getText().toString();
                int sd=Integer.parseInt(stayDaysString);
                Pelatis pelatis= new Pelatis(category,sd);

//                if(category.equalsIgnoreCase("A"))
//                {
//                    xrewsh=100;
//
//                }
//                else if(category.equalsIgnoreCase("B"))
//                {
//                    xrewsh=80;
//                }
//                else if(category.equalsIgnoreCase("C"))
//                {
//                    xrewsh=50;
//                }
//                else{
//                    xrewsh=20;
//
//                }
//                xrewsh=xrewsh*sd;
                xrewsh=pelatis.computeXreosi();
                TextView result=(TextView)findViewById(R.id.restext);
                result.setText(Double.toString(xrewsh));



            }
        });

    }
}
