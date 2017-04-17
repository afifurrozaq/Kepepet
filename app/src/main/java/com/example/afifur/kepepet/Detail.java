package com.example.afifur.kepepet;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail extends AppCompatActivity {
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        EditText edit = (EditText) findViewById(R.id.input_name);
        EditText edit1 = (EditText) findViewById(R.id.input_phone);
        EditText edit2 = (EditText) findViewById(R.id.input_email);
        Button btn = (Button) findViewById(R.id.button2);
        Button btn1 = (Button) findViewById(R.id.sms);
        Button btn2 = (Button) findViewById(R.id.telephone);
        edit.setTypeface(typeface);
        edit1.setTypeface(typeface);
        edit2.setTypeface(typeface);
        btn.setTypeface(typeface);
        btn1.setTypeface(typeface);
        btn2.setTypeface(typeface);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("KEPEPET"));
        Button dial=(Button)findViewById(R.id.telephone);
        Button sms=(Button)findViewById(R.id.sms);
        Button rate=(Button)findViewById(R.id.button2);
        dial.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editTex
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("08980009811")));
            }
        });
        sms.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editTex
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                startActivity(sendIntent);
            }
        });

        rate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editTex
                Intent sendIntent = new Intent(getApplicationContext(), Proses.class);
                startActivity(sendIntent);
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
                case R.id.navigation_coba:
                    Intent k = new Intent(getApplicationContext(), Profile.class);
                    startActivity(k);
                    return true;
            }
            return false;
        }

    };
}
