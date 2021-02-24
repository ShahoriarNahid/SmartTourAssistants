package com.example.smarttourassistants;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.smarttourassistants.Fragment.AboutFragment;
import com.example.smarttourassistants.Fragment.HomeFragment;
import com.example.smarttourassistants.Fragment.HotelnRestaurantsFragment;
import com.example.smarttourassistants.Fragment.RestaurantFragment;
import com.example.smarttourassistants.Fragment.SuggestedPlaceFragment;
import com.example.smarttourassistants.Fragment.TourGuidelineFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    ActionBar ab;
    DrawerLayout dl;
    NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeToolBar();
        initializeDrawer();

        ab.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        ab.setDisplayHomeAsUpEnabled(true);

       getSupportFragmentManager().beginTransaction().add(R.id.fr, new HomeFragment()).commit();

    }


    private void initializeDrawer() {

        dl = findViewById(R.id.dl);
        nv = findViewById(R.id.navigation);
        nv.setNavigationItemSelectedListener(this);

    }

    private void initializeToolBar() {

        toolbar = findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        ab = getSupportActionBar();
        ab.setTitle("Smart Tour Assistants");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){

            if(dl.isDrawerOpen(GravityCompat.START)){
                dl.closeDrawers();
            } else {
                dl.openDrawer(GravityCompat.START);
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.homedl:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new HomeFragment()).commit();
                dl.closeDrawers();
                break;

            case R.id.suggested_place:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new SuggestedPlaceFragment()).commit();
                dl.closeDrawers();
                break;

            case R.id.hotel:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new HotelnRestaurantsFragment()).commit();
                dl.closeDrawers();
                break;


            case R.id.restaurant:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new RestaurantFragment()).commit();
                dl.closeDrawers();
                break;


            case R.id.tourguideline:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new TourGuidelineFragment()).commit();
                dl.closeDrawers();
                break;

            case R.id.aboutus:
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.fr, new AboutFragment()).commit();
                dl.closeDrawers();
                break;
        }

        return false;
    }
}
