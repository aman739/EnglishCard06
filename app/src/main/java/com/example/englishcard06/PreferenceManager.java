package com.example.englishcard06;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class PreferenceManager {

    SharedPreferences sharedPreferences;

    @Inject
    public PreferenceManager(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public boolean getBoolean() {
        return sharedPreferences.getBoolean("shared_prefs", false);
    }

    public void setBoolean(boolean isShown) {
        sharedPreferences.edit().putBoolean("shared_prefs", isShown).apply();
    }
}
