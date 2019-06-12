package fauziharuna.dev.bridgemonitoring.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

public class SpinnerMaterial extends AppCompatActivity {
    String[] subKomponen={"Kerangka","Lantai","Ikatan Angin"};
    String[] Komponen={"Gelagar Utama","Gelagar Bawah","Penguat"};

    @Override
    public void onCreate( Bundle savedInstanceState,  PersistableBundle persistentState) {

        super.onCreate(savedInstanceState, persistentState);

    }
}
