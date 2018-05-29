package com.example.ind.lowestpathcount;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private PathOptionsPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pagerAdapter = new PathOptionsPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}
