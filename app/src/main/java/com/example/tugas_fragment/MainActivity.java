package com.example.tugas_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = new data_pahlawan();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.activity_bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(selectedFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu_balok:
                selectedFragment = new perhitungan_balok();
                break;
            case R.id.menu_pahlawan:
                selectedFragment = new data_pahlawan();
                break;
        }
        return loadFragment(selectedFragment);

    }

    private boolean loadFragment(Fragment selectedFragment) {
        if (selectedFragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activity_container,selectedFragment)
                    .commit();
        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
