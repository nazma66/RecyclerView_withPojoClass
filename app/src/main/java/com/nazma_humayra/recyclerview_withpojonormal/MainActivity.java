package com.nazma_humayra.recyclerview_withpojonormal;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_withpojonormal.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product_1> product1List;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        product1List = new ArrayList<>();
        product1List.add(
                new Product_1(
                        1,"nazma",
                        "3 McLaren 570S",
                        "5204cc, 10 cylinders",
                        9.3,
                        700000,
                        R.drawable.image02)

        );
        product1List.add(
                new Product_1(
                        2,"nazma",
                        "4 Mercedes-AMG GT",
                        "2981cc, 6 cylinders",
                        5.3,
                        100000,
                        R.drawable.image01));

        product1List.add(
                new Product_1(
                        1,"nazma",
                        "5 BMW i8",
                        "3799cc, 8 cylinders S (£110,500)",
                        8.3,
                        80000,
                        R.drawable.image02));


        ProductAdapter_1 adapter = new ProductAdapter_1(this, product1List);
        recyclerView.setAdapter(adapter);
    }
}