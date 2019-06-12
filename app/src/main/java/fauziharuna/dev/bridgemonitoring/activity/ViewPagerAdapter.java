package fauziharuna.dev.bridgemonitoring.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fragmentManager){

      super(fragmentManager);
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new FragmentSurveyIdentity();

            case 1:
                return new FragmentSurveyKerusakan();

            case 2:
                return new FragmentSurveyPerhitungan();

            case 3 :
                return new FragmentSurveySummary();

        }
        return null;

    }

    @Override
    public int getCount() {
        return 4;
    }
}
