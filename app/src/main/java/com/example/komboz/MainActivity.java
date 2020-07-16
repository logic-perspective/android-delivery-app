package com.example.komboz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile)
                .build();

//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);

        ArrayList<ProductItem> productList = new ArrayList<>();
        productList.add(new ProductItem(R.drawable.ic_person_black_24dp, "Line 1", "Line 2"));
        productList.add(new ProductItem(R.drawable.ic_notifications_black_24dp, "Line 1", "Line 2"));
        productList.add(new ProductItem(R.drawable.ic_dashboard_black_24dp, "Line 1", "Line 2"));
        productList.add(new ProductItem(R.drawable.ic_home_black_24dp, "Line 1", "Line 2"));
        productList.add(new ProductItem(R.drawable.ic_launcher_background, "Line 1", "Line 2"));

        mRecyclerView = findViewById(R.id.productListRecyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ProductListAdapter(productList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

}
