package fauziharuna.dev.bridgemonitoring.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.stepstone.stepper.BlockingStep;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;

import fauziharuna.dev.bridgemonitoring.R;

public class FragmentSurveySummary extends Fragment implements BlockingStep {
    final String key = "Summary";

    private TextView engName_tv, bridgeName_tv, bridgeLocation_tv, komponen_tv, subKomponen_tv, sistem_tv, bahan_tv;
    private String engNameText, bridgeNameText, bridgeLocationText, komponenText, subKomponenText, sistemText, bahanText, kerusakanText;
    private Double dLuasan1, dLuasan2, dKoreksi, dNilai1, dNilai2, dBobotKomponen, dInterval, dIksk, dIkus, dIkkj, dIks;
    StepperLayout stepperLayout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_survey_summary, container, false);

//        Bundle bSummary = getArguments();
//        engName_tv = view.findViewById(R.id.tv_EngName);
//        engNameText = bSummary.getString("engineer");
//        engName_tv.setText("test" + engNameText);
//
//        bridgeName_tv = view.findViewById(R.id.tv_BridgeName);
//        Log.d(key, "onCreateView bridgeName_tv = " + bridgeName_tv);
//        //        bridgeNameText=bSummary.getString("bridge");
////        bridgeName_tv.setText(bridgeNameText);
//
//        bridgeLocation_tv = view.findViewById(R.id.tv_location);
//        komponen_tv = view.findViewById(R.id.tv_komponen);
//        komponenText = bSummary.getString("komponen");
//        komponen_tv.setText("test " + komponenText);
//
//        subKomponen_tv = view.findViewById(R.id.tv_subKomponen);
//        subKomponenText = bSummary.getString("subkomponen");
//        subKomponen_tv.setText(subKomponenText);
//
//        bahan_tv = view.findViewById(R.id.tv_bahan);
//        bahanText = bSummary.getString("bahan");
//        bahan_tv.setText(bahanText);
//
//        sistem_tv = view.findViewById(R.id.tv_sistem);
//        sistemText = bSummary.getString("sistem");
//        sistem_tv.setText(sistemText);


        return view;


    }

    @Override
    public void onError(@NonNull VerificationError error) {

    }

    @Override
    public void onSelected() {
//        getBundle1();
//
//        Bundle b2 = ((FormActivity) getActivity()).getBundle2();
//        kerusakanText = b2.getString("rusak");
//        ((TextView) getView().findViewById(R.id.tv_kerusakan_a)).setText(kerusakanText);
//        dInterval = b2.getDouble("interval");
//        ((TextView) getView().findViewById(R.id.tv_interva_a)).setText((dInterval).toString());
//        dLuasan1 = b2.getDouble("luasan1");
//        ((TextView) getView().findViewById(R.id.tv_luasan_a)).setText((dLuasan1).toString());
//        dLuasan2 = b2.getDouble("luasan2");
//        ((TextView) getView().findViewById(R.id.tv_luasan_b)).setText((dLuasan2).toString());
//        dKoreksi = b2.getDouble("koreksi");
//        ((TextView) getView().findViewById(R.id.tv_koreksi)).setText((dKoreksi).toString());
//        dNilai1 = b2.getDouble("nilai1");
//        ((TextView) getView().findViewById(R.id.tv_nilai1)).setText((dNilai1).toString());
//        dNilai2 = b2.getDouble("nilai2");
//        ((TextView) getView().findViewById(R.id.tv_nilai2)).setText((dNilai2).toString());
//        dBobotKomponen = b2.getDouble("bobot_komponen");
//        ((TextView) getView().findViewById(R.id.tv_bobotKomponen)).setText((dBobotKomponen).toString());
//
//        Bundle b3 = ((FormActivity) getActivity()).getBundle3();
//        dIksk = b3.getDouble("iksk");
//        ((TextView) getView().findViewById(R.id.tv_IKSK_a)).setText((dIksk).toString());
//        dIkkj = b3.getDouble("ikkj");
//        ((TextView) getView().findViewById(R.id.tv_IKKJ_a)).setText((dIkkj).toString());
//        dIks = b3.getDouble("iks");
//        ((TextView) getView().findViewById(R.id.tv_IKS_a)).setText((dIks).toString());
//        dIkus = b3.getDouble("ikus");
//        ((TextView) getView().findViewById(R.id.tv_IKUS_a)).setText((dIkus).toString());


    }

    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onNextClicked(StepperLayout.OnNextClickedCallback callback) {

    }

    @Override
    public void onCompleteClicked(StepperLayout.OnCompleteClickedCallback callback) {

    }

    @Override
    public void onBackClicked(StepperLayout.OnBackClickedCallback callback) {
        callback.goToPrevStep();

    }
    public void getBundle1(){

        Bundle b1 = ((FormActivity) getActivity()).getBundle1();

        bridgeNameText = b1.getString("bridge");
        Log.d(key, "bridgeName_tv = " + bridgeName_tv);
        ((TextView) getView().findViewById(R.id.tv_BridgeName)).setText(bridgeNameText);

        engNameText = b1.getString("engineer");
        Log.d(key, "engName_tv = " + engName_tv);
        ((TextView) getView().findViewById(R.id.tv_EngName)).setText(engNameText);

        bridgeLocationText = b1.getString("location");
        Log.d(key, "bridgeLocation_tv " + bridgeLocation_tv);
        ((TextView) getView().findViewById(R.id.tv_location)).setText(bridgeNameText);

        subKomponenText = b1.getString("subkomponen");
        Log.d(key, "subkomponen_tv " + subKomponen_tv);
        ((TextView) getView().findViewById(R.id.tv_subKomponen)).setText(subKomponenText);

        komponenText = b1.getString("komponen");
        Log.d(key, "komponen_tv " + komponen_tv);
        ((TextView) getView().findViewById(R.id.tv_komponen)).setText(komponenText);

        subKomponenText = b1.getString("subkomponen");
        Log.d(key, "subkomponen_tv " + subKomponen_tv);
        ((TextView) getView().findViewById(R.id.tv_subKomponen)).setText(subKomponenText);

        bahanText = b1.getString("bahan");
        Log.d(key, "bahan_tv " + bahan_tv);
        ((TextView) getView().findViewById(R.id.tv_bahan)).setText(bahanText);

        sistemText = b1.getString("sistem");
        Log.d(key, "sistem_tv " + sistem_tv);
        ((TextView) getView().findViewById(R.id.tv_sistem)).setText(sistemText);

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
//        if (currentPosition>0){
//            stepperLayout.onBackClicked();
//        }else{
//            getActivity().finish();
//        }
//
//    }

}
