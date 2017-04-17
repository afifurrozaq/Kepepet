package com.example.afifur.kepepet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.nearby.connection.Connections;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayoutAndroid;
    CoordinatorLayout rootLayoutAndroid;
    GridView gridView;
    Context context;
    ArrayList arrayList;

    public static String[] gridViewStrings = {
            "Tukang Kunci",
            "Tambal Ban",
            "Bengkel",
            "Fotografer",

    };
    public static int[] gridViewImages = {
            R.drawable.kunci,
            R.drawable.ban,
            R.drawable.service,
            R.drawable.foto
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new CustomAndroidGridViewAdapter(this, gridViewStrings, gridViewImages));

        initInstances();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                        String test ="0";
                        i.putExtra("id", position);
                        i.putExtra("d", test);
                        startActivity(i);
                        break;

                    case 1:
                        //Use some different intent here
                        Intent j = new Intent(getApplicationContext(), MapsActivity.class);
                        String test1 ="1";
                        j.putExtra("id", position);
                        j.putExtra("d", test1);
                        startActivity(j);
                        break;
                    case 2:
                        //Use some different intent here
                        Intent k = new Intent(getApplicationContext(), MapsActivity.class);
                        String test2 ="2";
                        k.putExtra("id", position);
                        k.putExtra("d", test2);
                        startActivity(k);
                        break;
                    case 3:
                        //Use some different intent here
                        Intent l = new Intent(getApplicationContext(), MapsActivity.class);
                        String test3 ="3";
                        l.putExtra("id", position);
                        l.putExtra("d", test3);
                        startActivity(l);
                        break;

                    default:
                        break;
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
                case R.id.navigation_coba:
                    Intent k = new Intent(getApplicationContext(), Profile.class);
                    startActivity(k);
                    return true;
            }
            return false;
        }

    };

    private void initInstances() {
        rootLayoutAndroid = (CoordinatorLayout) findViewById(R.id.android_coordinator_layout);
        collapsingToolbarLayoutAndroid = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_android_layout);

    }
}
