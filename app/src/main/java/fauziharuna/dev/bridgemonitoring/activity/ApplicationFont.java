package fauziharuna.dev.bridgemonitoring.activity;

import android.app.Application;

public class ApplicationFont extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "Montserrat_Regular.ttf");

    }
}
