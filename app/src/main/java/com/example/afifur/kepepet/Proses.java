package com.example.afifur.kepepet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class Proses extends AppCompatActivity {

    CheckBox chck1,chck2,chck3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);
        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        chck1 = (CheckBox) findViewById(R.id.checkBox);
        chck2 = (CheckBox) findViewById(R.id.checkBox2);
        chck3 = (CheckBox) findViewById(R.id.checkBox3);
        chck1.setTypeface(typeface);
        chck2.setTypeface(typeface);
        chck3.setTypeface(typeface);
        chck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chck1.isChecked() && chck2.isChecked()) {
                    Intent sendIntent = new Intent(getApplicationContext(), Rating.class);
                    startActivity(sendIntent);
                }
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent j = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(j);
                    return true;
                case R.id.navigation_dashboard:
                    Intent i = new Intent(getApplicationContext(), Help.class);
                    startActivity(i);
                    return true;
            }
            return false;
        }

    };

}
