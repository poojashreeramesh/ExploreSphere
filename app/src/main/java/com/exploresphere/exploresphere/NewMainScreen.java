package com.exploresphere.exploresphere;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewMainScreen extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_new_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }
    HomeFragment firstFragment = new HomeFragment();
    calendarFragment secondFragment = new calendarFragment();
    CallFragment thirdFragment = new CallFragment();

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {


           if(item.getItemId() == R.id.navigation_home) {
               getSupportFragmentManager()
                       .beginTransaction()
                       .replace(R.id.flFragment, firstFragment)
                       .commit();
               return true;
           }
        if(item.getItemId() == R.id.navigation_dashboard) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, secondFragment)
                    .commit();
            return true;
        }
        if(item.getItemId() == R.id.navigation_notifications) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, thirdFragment)
                    .commit();
            return true;
        }
        return false;

}
}
