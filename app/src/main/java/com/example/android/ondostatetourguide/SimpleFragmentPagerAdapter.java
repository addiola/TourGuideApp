package com.example.android.ondostatetourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Addi_ola on 29/11/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context context;


    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        }else   {
            return new SiteSeeingFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];
        if (position == 0) {
            String event_title = context.getString(R.string.event_title);
            return event_title;
        } else if (position == 1){
            return context.getString(R.string.hotel_title);
        } else if (position == 2) {
            return context.getString(R.string.eat_title);
        }else   {
            return context.getString(R.string.go_to_title);
        }
    }

}

