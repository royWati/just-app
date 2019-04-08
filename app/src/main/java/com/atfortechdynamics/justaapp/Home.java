package com.atfortechdynamics.justaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends Activity {

    ImageView imageView;

    EditText email,password;

    Button signin,btnMoveToActivity2;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first_layout);

        imageView = findViewById(R.id.imageView2);
        email= findViewById(R.id.usernameTtx);
        password = findViewById(R.id.passwordTxt);
        signin = findViewById(R.id.btnSignIn);
        btnMoveToActivity2 = findViewById(R.id.btnMoveToActivity2);
        // attach an action listener
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ps = password.getText().toString();
                Toast.makeText(getApplicationContext(),
                        ps,
                        Toast.LENGTH_SHORT).show();
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em = email.getText().toString();
                Toast.makeText(getApplicationContext(),
                        em,
                        Toast.LENGTH_SHORT).show();
        }
        });

        btnMoveToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Elements1.class);
                startActivity(intent);
            }
        });

    }

}
