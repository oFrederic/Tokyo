package com.example.android.tokyo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class AreaFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public AreaFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new ShinjukuFragment();
        } else if (i == 1) {
            return new AkihabaraFragment();
        } else if (i == 2) {
            return new OdaibaFragment();
        } else if (i == 3) {
            return new RoppongiFragment();
        } else {
            return new UenoFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    /**
     *
     * @return the appropriate name to the tab.
     */
    @Override
    public CharSequence getPageTitle(int i) {
        if (i == 0) {
            return mContext.getString(R.string.shinjuku_kanji);
        } else if (i == 1) {
            return "秋葉原";
        } else if (i == 2) {
            return "お台場";
        } else if (i == 3) {
            return "六本木";
        } else {
            return "上野";
        }
    }
}
