package com.akillitarifler.yemekhanem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {
   ImageView deserts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


         deserts = (ImageView) findViewById(R.id.deserts);

         deserts.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(CategoryActivity.this,MenuActivity.class);
                 startActivity(i);



             }
         });

    }


}
