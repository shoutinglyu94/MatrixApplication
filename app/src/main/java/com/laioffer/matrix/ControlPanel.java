package com.laioffer.matrix;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ControlPanel extends AppCompatActivity {


    /**
     * Fragment pager allows us to choose fragments
     */
    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 1;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return LoginFragment.newInstance();
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Account";
            }

            return null;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        vpPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        vpPager.setCurrentItem(0);

    }
}
