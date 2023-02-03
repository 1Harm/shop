package com.moccha.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.moccha.shoppingcart.activities.ProfileActivity;
import com.moccha.shoppingcart.activities.SettingsActivity;
import com.moccha.shoppingcart.adapter.DetailedAdapter;
import com.moccha.shoppingcart.model.DetailedModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CardView drinks, snacks, foods, topUp;
    RecyclerView detailedRecyclerView;
    DetailedAdapter detailedAdapter;
    List<DetailedModel> detailedModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detailedRecyclerView = findViewById(R.id.shampoo_item);
        drinks = findViewById(R.id.drinks_menu);
        snacks = findViewById(R.id.snacks_menu);
        foods = findViewById(R.id.foods_menu);
        topUp = findViewById(R.id.topUp_menu);
        LinearLayout myOrder = findViewById(R.id.my_order);

        myOrder.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyOrderActivity.class);
            startActivity(intent);
        });

        drinks.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ItemListActivity.class);
            String value = "drink";
            intent.putExtra("choice", value);
            startActivity(intent);
        });

        foods.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ItemListActivity.class);
            String value = "food";
            intent.putExtra("choice", value);
            startActivity(intent);
        });

        snacks.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ItemListActivity.class);
            String value = "snack";
            intent.putExtra("choice", value);
            startActivity(intent);
        });
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        detailedModels = new ArrayList<>();
        detailedModels.add(new DetailedModel("Shampoo","For head and shoulders the best shampoo.","$ 100", "1","per unit",R.drawable.sham,R.drawable.sham));
        detailedModels.add(new DetailedModel("Shampoo","For head and shoulders the best shampoo.","$ 40", "1","per unit",R.drawable.sham,R.drawable.sham));
        detailedModels.add(new DetailedModel("Shampoo","For head and shoulders the best shampoo","$ 30", "1","per unit",R.drawable.sham2,R.drawable.sham2));
        detailedModels.add(new DetailedModel("Shampoo","For head and shoulders the best shampoo","$ 20", "1","per unit",R.drawable.sham2,R.drawable.sham2));
        setDetailedRecycler(detailedModels);
        topUp.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "top up successfully", Toast.LENGTH_SHORT).show());
    }

    private void setDetailedRecycler(List<DetailedModel> detailedModels) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        detailedRecyclerView.setLayoutManager(layoutManager);
        detailedAdapter = new DetailedAdapter(this,detailedModels);
        detailedRecyclerView.setAdapter(detailedAdapter);
    }
}