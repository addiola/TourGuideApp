package com.example.android.ondostatetourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Addi_ola on 29/11/2017.
 */

public class ViewAllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_tab.xml layout file
        setContentView(R.layout.activity_tab);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tablayout that will allow the user to view pagers on a single page with tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        //Set tab unto views
        tabLayout.setupWithViewPager(viewPager);


    }
}