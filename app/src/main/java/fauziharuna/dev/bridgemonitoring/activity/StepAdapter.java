package fauziharuna.dev.bridgemonitoring.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.widget.Switch;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

import fauziharuna.dev.bridgemonitoring.R;

public class StepAdapter extends AbstractFragmentStepAdapter {
    private static final String CURRENT_STEP_POSITION_KEY = "StepperBridge";

    public StepAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }


    @Override
    public Step createStep(int position) {
        switch (position) {
            case 0:
                final FragmentSurveyIdentity step = new FragmentSurveyIdentity();
                Bundle b = new Bundle();
                b.putInt(CURRENT_STEP_POSITION_KEY, position);
                step.setArguments(b);
                return step;
            case 1:
                final FragmentSurveyKerusakan stepKerusakan = new FragmentSurveyKerusakan();
                Bundle bKerusakan = new Bundle();
                bKerusakan.putInt(CURRENT_STEP_POSITION_KEY,position);
                stepKerusakan.setArguments(bKerusakan);
                return stepKerusakan;
            case 2:
                final FragmentSurveyPerhitungan stepPerhitungan = new FragmentSurveyPerhitungan();
                Bundle bPerhitungan = new Bundle();
                bPerhitungan.putInt(CURRENT_STEP_POSITION_KEY,position);
                stepPerhitungan.setArguments(bPerhitungan);
                return stepPerhitungan;
            case 3:
                final FragmentSurveySummary stepSummary = new FragmentSurveySummary();
                Bundle bSummary= new Bundle();
                bSummary.putInt(CURRENT_STEP_POSITION_KEY,position);
                stepSummary.setArguments(bSummary);
                return stepSummary;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        switch (position) {
            //Override this method to set Step title for the Tabs, not necessary for other stepper types
            case 0:
            return new StepViewModel.Builder(context)
                    .setTitle("Identity") //can be a CharSequence instead
                    .create();
            case 1:
                return new StepViewModel.Builder(context)
                        .setTitle("Kerusakan") //can be a CharSequence instead
                        .create();
            case 2:
                return new StepViewModel.Builder(context)
                        .setTitle("Perhitungan") //can be a CharSequence instead
                        .create();
            case 3:
                return new StepViewModel.Builder(context)
                        .setTitle("Summary")
                        .create();
        }
        return null;
    }

}
