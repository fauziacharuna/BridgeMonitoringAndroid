package fauziharuna.dev.bridgemonitoring.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.stepstone.stepper.BlockingStep;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import fauziharuna.dev.bridgemonitoring.R;

public class FragmentSurveyKerusakan extends Fragment implements BlockingStep {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    MaterialBetterSpinner interval;
    TextView tvTittle;
    StepperLayout stepperLayout;
    private String kerusakan, sLuasan1, sLuasan2, sFaktorKoreksi, sFaktorNilai1, sFaktorNilai2, sPengurang, sBobotKomponen;
    private int intervalKerusakan,intervalSelected;
    private Double luasan1, luasan2, nilaiPengurang, faktorKoreksi, faktorNilai1, faktorNilai2, bobotKomponen;
    private EditText edtKerusakan, edtLuasan1, edtLuasan2, edtNilaiPengurang, edtFaktorKoreksi, edtFaktorNilai1, edtFaktorNilai2, edtBobotKomponen;


    private Integer[] valKerusakan = {1, 2, 3, 4, 5};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_survey_kerusakan, container, false);

        tvTittle = view.findViewById(R.id.tv_title);
        Typeface customFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Montserrat-Bold.ttf");
        tvTittle.setTypeface(customFont);

        /*SPINNER INTERVAL KERUSAKAN*/
        interval = (MaterialBetterSpinner) view.findViewById(R.id.spinner_intervalKerusakan);
        ArrayAdapter<Integer> intervalAdapter = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, valKerusakan);
        intervalAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        interval.setAdapter(intervalAdapter);
        interval.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                intervalSelected = Integer.parseInt(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /*EDIT TEXT*/
        edtKerusakan = view.findViewById(R.id.et_kerusakan);
        kerusakan = edtKerusakan.getText().toString();

        edtLuasan1 = view.findViewById(R.id.et_luasan1);
        sLuasan1 = edtLuasan1.getText().toString();
        if (!sLuasan1.isEmpty()) {
            try {
                luasan1 = Double.valueOf(sLuasan1);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();

            }
        }
        edtLuasan2 = view.findViewById(R.id.et_luasan2);
        sLuasan2 = edtLuasan2.getText().toString();
        if (!sLuasan2.isEmpty()) {
            try {
                luasan2 = Double.valueOf(sLuasan2);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();

            }
        }

        edtFaktorKoreksi = view.findViewById(R.id.et_faktorKoreksi);
        sFaktorKoreksi = edtFaktorKoreksi.getText().toString();
        if (!sFaktorKoreksi.isEmpty()) {
            try {
                faktorKoreksi = Double.parseDouble(sFaktorKoreksi);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();

            }
        }
        edtFaktorNilai1 = view.findViewById(R.id.et_faktorNilai1);
        sFaktorNilai1 = edtFaktorNilai1.getText().toString();
        if (!sFaktorNilai1.isEmpty()) {
            try {
                faktorNilai1 = Double.parseDouble(sFaktorNilai1);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();
            }
        }
        edtFaktorNilai2 = view.findViewById(R.id.et_faktorNilai2);
        sFaktorNilai2 = edtFaktorNilai2.getText().toString();
        if (!sFaktorNilai2.isEmpty()) {
            try {
                faktorNilai2 = Double.parseDouble(sFaktorNilai2);

            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();
            }
        }

        edtNilaiPengurang = view.findViewById(R.id.et_nilaiPengurang);
        sPengurang = edtNilaiPengurang.getText().toString();
        if (!sPengurang.isEmpty()) {
            try {
                nilaiPengurang = Double.parseDouble(sPengurang);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input number Only", Toast.LENGTH_SHORT).show();
            }
        }
        edtBobotKomponen = view.findViewById(R.id.et_bobotKomponen);
        sBobotKomponen = edtBobotKomponen.getText().toString();
        if (!sBobotKomponen.isEmpty()) {
            try {
                bobotKomponen = Double.parseDouble(sBobotKomponen);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), "Input Number only", Toast.LENGTH_SHORT).show();
            }
        }


//        MaterialBetterSpinner intervalKerusakan=(MaterialBetterSpinner)view.findViewById(R.id.spinner_intervalKerusakan);
//        ArrayAdapter<String> adapterBahan=new ArrayAdapter<>(this.getActivity(),android.R.layout.simple_list_item_1, Bahan);
//        adapterBahan.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        bahanSpinner.setAdapter(adapterBahan);
        return view;
    }

    @Override
    public void onError(@NonNull VerificationError error) {

    }

    @Override
    public void onSelected() {

    }

    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onNextClicked(StepperLayout.OnNextClickedCallback callback) {
//        String rusak=edtKerusakan.getText().toString();
//        Integer interval=(intervalSelected);
//        Double dLuasan=Double.parseDouble(luasan1.toString());
//        Double dLuasan2=Double.parseDouble(luasan2.toString());
//        Double dKoreksi=Double.parseDouble(faktorKoreksi.toString());
//        Double dNilai1=Double.parseDouble(faktorNilai1.toString());
//        Double dNilai2=Double.parseDouble(faktorNilai2.toString());
//        Double dBobotKomponen=Double.parseDouble(bobotKomponen.toString());
//
//
//        Bundle kerusakanSurvey = new Bundle();
//        Log.d("test","bundle2 + "+kerusakanSurvey);
//        kerusakanSurvey.putString("rusak", rusak);
//        kerusakanSurvey.putInt("interval", interval);
//        kerusakanSurvey.putDouble("luasan1", dLuasan);
//        kerusakanSurvey.putDouble("luasan2", dLuasan2);
//        kerusakanSurvey.putDouble("koreksi", dKoreksi);
//        kerusakanSurvey.putDouble("nilai1", dNilai1);
//        kerusakanSurvey.putDouble("nilai2", dNilai2);
//        kerusakanSurvey.putDouble("bobot_komponen", dBobotKomponen);
//
//        ((FormActivity) getActivity()).saveBundle2(kerusakanSurvey);
//
//        fragmentManager = getActivity().getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmentSurveySummary summary = new FragmentSurveySummary();
//        summary.setArguments(kerusakanSurvey);

///             getFragmentManager().beginTransaction().add(R.id.fl_contentSurvey,summary).commit();


        callback.goToNextStep();
        callback.getStepperLayout().hideProgress();


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
//        if (currentPosition>0){
//            stepperLayout.onBackClicked();
//        }else{
//            getActivity().finish();
//        }
//
//
//    }


//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        Button nextButton = (Button)view.findViewById(R.id.btn_next2);
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fl_contentSurvey, new FragmentSurveyPerhitungan());
//                fragmentTransaction.commit();
//
//            }
//        });
//    }
}
