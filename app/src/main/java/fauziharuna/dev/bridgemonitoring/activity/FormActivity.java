package fauziharuna.dev.bridgemonitoring.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;

import fauziharuna.dev.bridgemonitoring.R;

public class FormActivity extends AppCompatActivity implements StepperLayout.StepperListener {
    Toolbar toolbar;
    ViewPagerAdapter viewPager;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FloatingActionButton fab;
    StepperLayout stepper;
    Bundle bundle1, bundle2, bundle3;
    StepAdapter stepAdapter;

    private final String key = "summary";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

//        toolbar=(Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Survey Monitoring");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        stepper = (StepperLayout) findViewById(R.id.stepperLayout);
        stepAdapter = new StepAdapter(getSupportFragmentManager(), this);
        stepper.setAdapter(stepAdapter);


//        ViewPager viewPager=findViewById(R.id.view_pager);
//        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        FragmentSurveyIdentity surveyIdentity = new FragmentSurveyIdentity();
        fragmentTransaction.add(R.id.fl_contentSurvey, surveyIdentity);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }

    public void saveBundle1(Bundle b) {
        this.bundle1 = b;
        Log.d(key, "saveBundle1 ");
    }

    public Bundle getBundle1() {
        return bundle1;
    }

    public void saveBundle2(Bundle b2) {
        this.bundle2 = b2;
        Log.d(key, "saveBundle2 ");
    }

    public Bundle getBundle2() {
        return bundle2;
    }

    public void saveBundle3(Bundle b3) {
        this.bundle3 = b3;
        Log.d(key, "saveBundle3 ");
    }

    public Bundle getBundle3() {
        return bundle3;
    }

    @Override
    public void onCompleted(View completeButton) {
        Toast.makeText(this, "onCompleted!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(VerificationError verificationError) {
        Toast.makeText(this, "onError! -> " + verificationError.getErrorMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStepSelected(int newStepPosition) {

    }

    @Override
    public void onReturn() {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
//    public void showData(){
////        ((FragmentSurveySummary)stepAdapter.getItem(3)).showBundle(bundle1);
////        ((FragmentSurveySummary)stepAdapter.get(3)).showBundle(bundle1);
//        Log.d(key,"showData ");
//    }

}
