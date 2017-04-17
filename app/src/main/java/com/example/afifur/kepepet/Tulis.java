package com.example.afifur.kepepet;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tulis extends AppCompatActivity {
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulis);
        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textedit = (TextView) findViewById(R.id.judul);
        EditText edit = (EditText) findViewById(R.id.textArea_information);
        textedit.setTypeface(typeface);
        edit.setTypeface(typeface);
    }
}
