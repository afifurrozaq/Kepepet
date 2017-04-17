package com.example.afifur.kepepet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        String customFont = "futura.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView edit2 = (TextView) findViewById(R.id.keterangan);
        Button btn = (Button) findViewById(R.id.button2);
        edit2.setTypeface(typeface);
        btn.setTypeface(typeface);
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
