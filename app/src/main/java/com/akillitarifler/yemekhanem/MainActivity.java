package com.akillitarifler.yemekhanem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void category(View view){
        Intent i = new Intent(MainActivity.this,CategoryActivity.class);
        startActivity(i);


    }
    public void profile(View view){
        Intent i = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(i);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
