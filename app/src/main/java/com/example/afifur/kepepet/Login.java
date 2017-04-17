package com.example.afifur.kepepet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        Button login=(Button)findViewById(R.id.btn_login);
        EditText edit = (EditText) findViewById(R.id.input_email);
        EditText edit1 = (EditText) findViewById(R.id.input_password);
        TextView textView2 = (TextView) findViewById(R.id.text_signup);
        TextView textView1 = (TextView) findViewById(R.id.link_forgot);
        TextView textView = (TextView) findViewById(R.id.link_signup);

        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        textView2.setTypeface(typeface);
        textView1.setTypeface(typeface);
        textView.setTypeface(typeface);
        login.setTypeface(typeface);
        edit.setTypeface(typeface);
        edit1.setTypeface(typeface);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(getApplicationContext(), Register.class);
                startActivity(sendIntent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
