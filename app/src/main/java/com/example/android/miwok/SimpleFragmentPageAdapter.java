package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.R.attr.fragment;


/**
 * Created by Joel.Ange on 8/21/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private String mTabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases"};
    private final int PAGE_COUNT = mTabTitles.length;

    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new NumbersFragment();
                break;
            case 1:
                fragment = new FamilyFragment();
                break;
            case 2:
                fragment = new ColorsFragment();
                break;
            case 3:
                fragment = new PhrasesFragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        String tabTitle = "";
        if (position >= 0 && position <= PAGE_COUNT) {
            tabTitle = mTabTitles[position];
        }
        return tabTitle;
    }
}
