package com.example.ind.lowestpathcount;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PathOptionsPagerAdapter extends FragmentPagerAdapter {

    public PathOptionsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LowestPathCountExamplesFragment();
            case 1:
                return new LowestPathCountCustomFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Example Grids";
            case 1:
                return "Custom Grid";
            default:
                return null;
        }
    }
}
