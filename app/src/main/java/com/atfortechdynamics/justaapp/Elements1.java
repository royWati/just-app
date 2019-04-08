package com.atfortechdynamics.justaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Elements1 extends AppCompatActivity {

    CheckBox checkBoxMaths,checkBoxEnglish,checkBoxKiswahili;
    Button btnMove;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_one);

        checkBoxMaths = findViewById(R.id.checkboxOne);
        checkBoxEnglish = findViewById(R.id.checkboxTwo);
        checkBoxKiswahili = findViewById(R.id.checkboxThree);

        btnMove = findViewById(R.id.btnMoveToActivity3);

        clickCheckBox(checkBoxMaths,"Mathematics is checked");
        clickCheckBox(checkBoxEnglish,"English is checked");
        clickCheckBox(checkBoxKiswahili,"Kiswahili is checked");

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elements1.this,ElementTwo.class);
                startActivity(intent);
            }
        });
    }

    public void clickCheckBox(final CheckBox checkBox, final String message){

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked())
                    Toast.makeText(getApplicationContext(),
                            message,
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
}
