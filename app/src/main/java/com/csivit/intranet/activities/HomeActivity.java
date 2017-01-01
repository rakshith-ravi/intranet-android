package com.csivit.intranet.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.csivit.intranet.R;
import com.csivit.intranet.fragments.AllEventsFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager tabs = (ViewPager) findViewById(R.id.tabs);
        tabs.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return new AllEventsFragment();
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
    }
}
