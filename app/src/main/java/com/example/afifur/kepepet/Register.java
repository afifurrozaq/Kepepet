package com.example.afifur.kepepet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        EditText edit = (EditText) findViewById(R.id.input_name);
        EditText edit1 = (EditText) findViewById(R.id.input_phone);
        EditText edit2 = (EditText) findViewById(R.id.input_email);
        EditText edit3 = (EditText) findViewById(R.id.input_password);
        Button btn = (Button) findViewById(R.id.btn_signup);
        edit.setTypeface(typeface);
        edit1.setTypeface(typeface);
        edit2.setTypeface(typeface);
        edit3.setTypeface(typeface);
        btn.setTypeface(typeface);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });
    }
}
