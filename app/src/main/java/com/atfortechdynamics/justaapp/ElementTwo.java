package com.atfortechdynamics.justaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ElementTwo extends AppCompatActivity {

    RadioGroup radioGroup,radioGroupTraffic;

    LinearLayout linearLayout;

    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_two);
        radioGroup = findViewById(R.id.rdgrp);
        radioGroupTraffic = findViewById(R.id.rgtraffic);
        linearLayout = findViewById(R.id.linearTwo);
        btnMove= findViewById(R.id.btnMoveToActivity4);
        //action listerner to our group
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbone:
                        Toast.makeText(getApplicationContext(),
                                "Male Clicked",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rbtwo :
                        Toast.makeText(getApplicationContext(),
                                "Female Clicked",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        radioGroupTraffic.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbGReen:
                        Toast.makeText(getApplicationContext(),
                                "GO!!",
                                Toast.LENGTH_SHORT).show();
                        linearLayout.setBackgroundColor(
                                getResources().getColor(R.color.GreenGo));
                        break;
                    case R.id.rbRed:
                        Toast.makeText(getApplicationContext(),
                                "STOP!!",
                                Toast.LENGTH_SHORT).show();
                        linearLayout.setBackgroundColor(
                                getResources().getColor(R.color.RedStop));
                        break;
                    case R.id.rbOrange:
                        Toast.makeText(getApplicationContext(),
                                "WAIT!!",
                                Toast.LENGTH_SHORT).show();
                        linearLayout.setBackgroundColor(
                                getResources().getColor(R.color.OrangeWait));
                        break;
                }
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ElementTwo.this,ElementFour.class);
                startActivity(intent);
            }
        });
    }
}
