package com.example.orderhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Order3Activity extends AppCompatActivity {

    Button Order_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order3);

        Order_3 = (Button) findViewById(R.id.Order_3);

        //List<String> ratings = new ArrayList<>();
        //ratings.add(" ");
        //ratings.add("Star Rating");




        //ArrayAdapter arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, ratings);

        //Order_3.setAdapter(arrayAdapter);

        Order_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Order3Activity.this, RateOrder3.class));

            }
        });

       /* Order_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1) {

                    startActivity(new Intent(Order3Activity.this, RateOrder3.class));

                }

            }
        });*/


    }
}