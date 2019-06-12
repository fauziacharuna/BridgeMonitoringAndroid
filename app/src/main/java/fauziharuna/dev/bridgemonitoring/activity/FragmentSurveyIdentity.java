package fauziharuna.dev.bridgemonitoring.activity;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
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
import android.widget.EditText;
import android.widget.TextView;

import com.stepstone.stepper.BlockingStep;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import fauziharuna.dev.bridgemonitoring.R;
import fauziharuna.dev.bridgemonitoring.model.AllEngineer;
import fauziharuna.dev.bridgemonitoring.model.EngineerModel;
import fauziharuna.dev.bridgemonitoring.network.GetDataService;
import fauziharuna.dev.bridgemonitoring.network.RetrofitClientInstansce;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentSurveyIdentity extends Fragment implements BlockingStep {

    MaterialBetterSpinner materialBetterSpinner;
    String[] bridge = {"Jembatan PascaSarjana UGM", "Jembatan Baru UGM", "Jembatan Ampera", "Jembatan Barito", "Jembatan Rantau Berangin", "Jembatan Pasar Ayam"};
    String[] engineer = {"Fauzi", "Pras", "Hafidz", "Ghanny"};
    String[] Komponen = {"Gelagar Utama", "Gelagar Bawah", "Penguat"};
    String[] subKomponen = {"Kerangka", "Lantai", "Ikatan Angin"};
    String[] sistem = {"Gelagar Atas", "Gelagar Bawah", "Aliran", "Pelengkap"};
    String[] Bahan = {"Pasangan Batu", "Pasangan Bata", "Beton", "Baja", "Kayu"};
    Context mContext;
    public String engNameText, bridgeNameText, bridgeLocationText, subKomponenText, komponenText, bahanText, sistemText;
    final String key = "summary";
    ProgressDialog loading;
    EditText etBridgeLocation;

    MaterialBetterSpinner spinnerEng, spinnerBridge, spinSubKomponen, spinKomponen, spinSistem, spinBahan;
    GetDataService apiServices;

    String spinnerKomponen, spinBridge, spinnerSubKomponen, spinnerSistem, spinnerBahan, spinnerEngineer;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    TextView tvTittle;
    Typeface typeface;

    private Activity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_survey_identity, container, false);
        spinnerEng = view.findViewById(R.id.spinner_engineer);
        spinnerBridge = view.findViewById(R.id.spinner_bridge);
        spinKomponen = view.findViewById(R.id.spinner_Komponen);
        spinSubKomponen = view.findViewById(R.id.spinner_subkomponen);
        spinSistem = view.findViewById(R.id.spinner_Sistem);
        spinBahan = view.findViewById(R.id.spinner_bahan);
        etBridgeLocation=view.findViewById(R.id.et_bridge_location);


        tvTittle = view.findViewById(R.id.tv_title);
        Typeface customFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Montserrat-Bold.ttf");
        tvTittle.setTypeface(customFont);


        apiServices = RetrofitClientInstansce.getRetrofitInstance().create(GetDataService.class);


//        initEnginerSpinner();
        ArrayAdapter<String> adapterEngineer = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, engineer);
        adapterEngineer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEng.setAdapter(adapterEngineer);
        spinnerEng.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerEngineer = parent.getItemAtPosition(position).toString();
                engNameText = spinnerEngineer.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapterBridge = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, bridge);
        adapterBridge.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBridge.setAdapter(adapterBridge);
        spinnerBridge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinBridge = parent.getItemAtPosition(position).toString();
                bridgeNameText = spinBridge.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        spinnerEng.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selectEngineer=parent.getItemAtPosition(position).toString();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

//        ArrayAdapter<String>adapterEng= new ArrayAdapter<>(this.getActivity(),android.R.layout.simple_list_item_1,Komponen);
//        adapterEng.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinnerEng.setAdapter(adapterEng);

        ArrayAdapter<String> adapterKomponen = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, Komponen);
        adapterKomponen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinKomponen.setAdapter(adapterKomponen);
        spinKomponen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerKomponen = parent.getItemAtPosition(position).toString();
                komponenText = spinnerKomponen.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapterSubKomponen = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, subKomponen);
        adapterSubKomponen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinSubKomponen.setAdapter(adapterSubKomponen);
        spinSubKomponen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerSubKomponen = parent.getItemAtPosition(position).toString();
                subKomponenText = spinnerSubKomponen.toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> adapterSistem = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, sistem);
        adapterSistem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinSistem.setAdapter(adapterSistem);
        spinSistem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerSistem = parent.getItemAtPosition(position).toString();
                sistemText = spinnerSistem.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapterBahan = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, Bahan);
        adapterBahan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinBahan.setAdapter(adapterBahan);
        spinBahan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerBahan = parent.getItemAtPosition(position).toString();
                bahanText = spinnerBahan.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Log.i(key,"bahan "+spinnerBahan);


        return view;

    }


    @Override
    public void onError(@NonNull VerificationError error) {

    }

    @Override
    public void onSelected() {

    }

    private void initEnginerSpinner() {
        apiServices = RetrofitClientInstansce.getRetrofitInstance().create(GetDataService.class);
//        spinnerEng = getView().findViewById(R.id.spinner_engineer);

        apiServices.getAllEngineer().enqueue(new Callback<EngineerModel>() {
            @Override
            public void onResponse(Call<EngineerModel> call, Response<EngineerModel> response) {

                List<AllEngineer> allEngineer = response.body().getAllEngineer();
                List<String> listEngSpinner = new ArrayList<String>();
                for (int i = 0; i < allEngineer.size(); i++) {

                    listEngSpinner.add(allEngineer.get(i).getSurveyorName());


                }
                Log.d(key, "json " + listEngSpinner);
                ArrayAdapter<String> adapterEng = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, listEngSpinner);
//                ArrayAdapter<String>adapterEng=ArrayAdapter.createFromResource(getActivity().getBaseContext(),android.R.layout.simple_dropdown_item_1line);

                adapterEng.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerEng.setAdapter(adapterEng);
            }

            @Override
            public void onFailure(Call<EngineerModel> call, Throwable t) {

            }
        });
    }

    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onNextClicked(final StepperLayout.OnNextClickedCallback callback) {
//
//        Bundle identitasSurvey = new Bundle();
//        etBridgeLocation = getView().findViewById(R.id.et_bridge_location);
//        bridgeLocationText = etBridgeLocation.getText().toString();
//
//        identitasSurvey.putString("engineer", engNameText);
//        identitasSurvey.putString("bridge", bridgeNameText);
//        identitasSurvey.putString("location", bridgeLocationText);
//        identitasSurvey.putString("subkomponen", subKomponenText);
//        identitasSurvey.putString("komponen", komponenText);
//        identitasSurvey.putString("sistem", sistemText);
//        identitasSurvey.putString("bahan", bahanText);
//
//        ((FormActivity) getActivity()).saveBundle1(identitasSurvey);
//
//        fragmentManager = getActivity().getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmentSurveySummary summary = new FragmentSurveySummary();
//        summary.setArguments(identitasSurvey);

///             getFragmentManager().beginTransaction().add(R.id.fl_contentSurvey,summary).commit();


        callback.goToNextStep();
        callback.getStepperLayout().hideProgress();


//        AlertDialog ad = new AlertDialog.Builder(getContext()).create();
//        ad.setTitle("Error");
//        ad.setMessage("Tidak boleh ada field yang kosong");
    }


    @Override
    public void onCompleteClicked(StepperLayout.OnCompleteClickedCallback callback) {

    }

    @Override
    public void onBackClicked(StepperLayout.OnBackClickedCallback callback) {

    }
    public void sendBundle1(){
        etBridgeLocation = getView().findViewById(R.id.et_bridge_location);
        bridgeLocationText = etBridgeLocation.getText().toString();

        spinnerEng = getView().findViewById(R.id.spinner_engineer);
        spinnerBridge = getView().findViewById(R.id.spinner_bridge);
        spinKomponen = getView().findViewById(R.id.spinner_Komponen);
        spinSubKomponen = getView().findViewById(R.id.spinner_subkomponen);
        spinSistem = getView().findViewById(R.id.spinner_Sistem);
        spinBahan = getView().findViewById(R.id.spinner_bahan);
        engNameText=spinnerEngineer.toString();
        bridgeNameText=spinBridge.toString();
        subKomponenText=spinnerSubKomponen.toString();
        komponenText=spinnerKomponen.toString();
        sistemText=spinnerSistem.toString();
        bahanText=spinnerBahan.toString();
        Bundle identitasSurvey = new Bundle();

        identitasSurvey.putString("engineer", engNameText);
        identitasSurvey.putString("bridge", bridgeNameText);
        identitasSurvey.putString("location", bridgeLocationText);
        identitasSurvey.putString("subkomponen", subKomponenText);
        identitasSurvey.putString("komponen", komponenText);
        identitasSurvey.putString("sistem", sistemText);
        identitasSurvey.putString("bahan", bahanText);

        ((FormActivity) getActivity()).saveBundle1(identitasSurvey);

        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        FragmentSurveySummary summary = new FragmentSurveySummary();
        summary.setArguments(identitasSurvey);

    }

}
