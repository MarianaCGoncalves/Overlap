package com.example.teamuptestground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.teamuptestground.databinding.ActivityMainBinding;

public class MainMenuActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        //binding.bottomNV.setOnItemSelectedListener( item -> {
            switch (item.getItemId()){
                case R.id.search:
                    replaceFragment(new SearchFragment());
                    break;
                case R.id.gps:
                    replaceFragment(new GpsFragment());
                    break;
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                }
                //return true;
                //});
            }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}
