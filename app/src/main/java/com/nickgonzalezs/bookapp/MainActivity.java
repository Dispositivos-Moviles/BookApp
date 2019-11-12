package com.nickgonzalezs.bookapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nickgonzalezs.bookapp.adapter.RecomendedBooksAdapter;
import com.nickgonzalezs.bookapp.adapter.VPMainAdapter;
import com.nickgonzalezs.bookapp.fragments.MyLibraryFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        ViewPager vpMain = findViewById(R.id.vp_main);
        BottomNavigationView bnvMain = findViewById(R.id.bnv_main);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);

        setupViewPagerListener(vpMain, bnvMain);
        setupBottomNavListener(vpMain, bnvMain);

        setupViewPager(vpMain);
    }

    private void setupBottomNavListener(ViewPager vpMain, BottomNavigationView bnvMain) {
        bnvMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
    }

    private void setupViewPagerListener(ViewPager vpMain, BottomNavigationView bnvMain) {
        vpMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setupViewPager(ViewPager vpMain) {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(MyLibraryFragment.newInstance("My Library"));
        fragments.add(MyLibraryFragment.newInstance("Explore"));
        fragments.add(MyLibraryFragment.newInstance("Settings"));

        VPMainAdapter vPMainAdapter = new VPMainAdapter(getSupportFragmentManager(), fragments);
        vpMain.setAdapter(vPMainAdapter);

    }
}
