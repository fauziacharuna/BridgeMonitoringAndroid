package fauziharuna.dev.bridgemonitoring.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import fauziharuna.dev.bridgemonitoring.R;

public class SplashScreen extends AppCompatActivity {
    TextView tvApps;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tvApps=findViewById(R.id.tv_apps);
        Typeface customFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        tvApps.setTypeface(customFont);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();
            }

        },2000);

    }


}
