package fauziharuna.dev.bridgemonitoring.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.List;

import fauziharuna.dev.bridgemonitoring.R;
import fauziharuna.dev.bridgemonitoring.adapter.AnswerAdapter;
import fauziharuna.dev.bridgemonitoring.model.AllAnswer;
import fauziharuna.dev.bridgemonitoring.model.AnswerModel;
import fauziharuna.dev.bridgemonitoring.network.GetDataService;
import fauziharuna.dev.bridgemonitoring.network.RetrofitClientInstansce;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FloatingActionButton fab;
    ProgressDialog progressDialog;
    public List<AllAnswer> answerList;
    private AnswerAdapter adapterAnswer;
    private RecyclerView recyclerView;

    Toolbar toolbar;
    private final String TAG = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        recyclerView = findViewById(R.id.rv_list_survey);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        adapterAnswer = new AnswerAdapter(this, answerList);
        recyclerView.setAdapter(adapterAnswer);

        GetDataService answerService = RetrofitClientInstansce.getRetrofitInstance().create(GetDataService.class);
        Call<AnswerModel> call = answerService.getAllAnswer();
        call.enqueue(new Callback<AnswerModel>() {
            @Override
            public void onResponse(Call<AnswerModel> call, Response<AnswerModel> response) {
                progressDialog.dismiss();
                generateDataList(response.body().getAllAnswer());
                Log.d(TAG, "Response " + response.body());

            }

            @Override
            public void onFailure(Call<AnswerModel> call, Throwable t) {
                progressDialog.dismiss();
                Log.d(TAG, "Response " + t.getMessage());
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();

            }
        });


//        toolbar=(Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Survey Monitoring");


        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        fab = findViewById(R.id.fab_add_survey);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surveyIntent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(surveyIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    //
//        FragmentSurveyIdentity survey=new FragmentSurveyIdentity();
//        fragmentTransaction.add(R.id.fr_content,survey);
//        fragmentTransaction.commit();
//
//        loadFragment(new HomeFragment());
//        // inisialisasi BottomNavigaionView
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
    // beri listener pada saat item/menu bottomnavigation terpilih
//        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//    }
//    private boolean loadFragment(Fragment fragment){
//        if (fragment != null){
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fr_content,fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        Fragment fragment=null;
//
//        switch (menuItem.getItemId()){
//            case R.id.home_menu:
//                fragment=new HomeFragment();
//                break;
//
//            case R.id.form_menu:
//                fragment=new FragmentSurveyIdentity();
//                break;
//            case R.id.account_menu:
//                fragment=new FragmentAccount();
//                break;
//        }
//        return loadFragment(fragment);
//
//    }
    private void generateDataList(List<AllAnswer> dataList) {
        recyclerView = findViewById(R.id.rv_list_survey);
        adapterAnswer = new AnswerAdapter(this, dataList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapterAnswer.answerItem=dataList;
        adapterAnswer.notifyDataSetChanged();
    }
}
