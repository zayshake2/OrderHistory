package com.example.orderhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //ListView Order_History;
    //ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView Order_History = findViewById(R.id.Order_History);

        List<String> orders = new ArrayList<>();
        orders.add("Order 1");
        orders.add("Order 2");
        orders.add("Order 3");




        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, orders);

        Order_History.setAdapter(arrayAdapter);

        Order_History.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {

                    startActivity(new Intent(MainActivity.this, Order1Activity.class));

                }
                else if(i==1) {
                    startActivity(new Intent(MainActivity.this, Order2Activity.class));
                }
                else if(i==2){
                    startActivity(new Intent(MainActivity.this, Order3Activity.class));
                }
            }
        });
    }


}