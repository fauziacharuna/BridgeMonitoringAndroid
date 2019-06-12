package fauziharuna.dev.bridgemonitoring.activity;

import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.stepstone.stepper.BlockingStep;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import fauziharuna.dev.bridgemonitoring.R;


public class FragmentSurveyPerhitungan extends Fragment implements BlockingStep {
    StepperLayout stepperLayout;
    TextView tvTittle;
    MaterialBetterSpinner spinInterval;
    EditText etIKSK,etIKKJ,etIKS,etIKUS;
    String sIKSK, sIKKJ, sIKS, sIKUS;
    Double dIKSK,dIKKJ,dIKS,dIKUS;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_survey_perhitungan, container, false);

        etIKSK= view.findViewById(R.id.et_iksk);
        sIKSK=etIKSK.getText().toString();
        if (!sIKSK.isEmpty()){
            try {
                dIKSK=Double.parseDouble(sIKSK);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        etIKS=view.findViewById(R.id.et_iks);
        sIKS=etIKS.getText().toString();
        if (!sIKS.isEmpty()) {
            try{
                dIKS=Double.parseDouble(sIKS);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        etIKKJ=view.findViewById(R.id.et_ikkj);
        sIKKJ=etIKKJ.getText().toString();
        if (!sIKKJ.isEmpty()){
            try{
                dIKKJ=Double.parseDouble(sIKKJ);

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        etIKUS=view.findViewById(R.id.et_ikus);
        sIKUS=etIKUS.getText().toString();
        if (!sIKUS.isEmpty()){
            try{
                dIKUS=Double.parseDouble(sIKUS);

            }catch (Exception e){
                e.printStackTrace();

            }
        }

        tvTittle=view.findViewById(R.id.tv_title);
        Typeface customFont=Typeface.createFromAsset(getActivity().getAssets(),"fonts/Montserrat-Bold.ttf");
        tvTittle.setTypeface(customFont);
        return view;
    }
    @Override
    public void onError(@NonNull VerificationError error) {

    }

    @Override
    public void onSelected() {


    }
    @Override
    public VerificationError verifyStep(){
        return null;
    }

    @Override
    public void onNextClicked(StepperLayout.OnNextClickedCallback callback) {
//        Bundle b3= new Bundle();
//        b3.putDouble("iksk",dIKSK);
//        b3.putDouble("ikus",dIKUS);
//        b3.putDouble("ikkj",dIKKJ);
//        b3.putDouble("iks",dIKS);
//        ((FormActivity) getActivity()).saveBundle3(b3);
//
//        fragmentManager = getActivity().getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmentSurveySummary summary = new FragmentSurveySummary();
//        summary.setArguments(b3);

        callback.goToNextStep();


    }
    public void nilaiBundle(){

    }

    @Override
    public void onCompleteClicked(StepperLayout.OnCompleteClickedCallback callback) {

    }

    @Override
    public void onBackClicked(StepperLayout.OnBackClickedCallback callback) {
        callback.goToPrevStep();

    }


//    @Override
//    public void onNextClicked(StepperLayout.OnNextClickedCallback callback) {
//
//    }
//
//    @Override
//    public void onCompleteClicked(StepperLayout.OnCompleteClickedCallback callback) {
//
//    }
//
//    @Override
//    public void onBackClicked(StepperLayout.OnBackClickedCallback callback) {
//        int currentPosition = stepperLayout.getCurrentStepPosition();
//        if (currentPosition > 0){
//            stepperLayout.onBackClicked();
//        }else{
//            getActivity().finish();
//        }



}
