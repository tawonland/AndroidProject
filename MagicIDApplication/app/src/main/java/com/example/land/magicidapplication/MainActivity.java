package com.example.land.magicidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {

    EditText    etID;
    Button      btnSubmit;
    TextView    tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID        = findViewById(R.id.etID);
        btnSubmit   = findViewById(R.id.btnSubmit);
        tvResult    = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idNumber = etID.getText().toString().trim();

                String dob = idNumber.substring(0,6);

                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if(gender < 5 )
                    sGender = "Female";
                else
                    sGender = "Male";

                //int nationality = Integer.parseInt(S)


            }
        });
    }
}
