package com.example.englishcard06.di;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import com.example.englishcard06.PreferenceManager;

import java.util.Map;
import java.util.Set;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import retrofit2.http.POST;

@Module
@InstallIn(SingletonComponent.class)
public class PreferenceModule {

    @Provides
    @Singleton
    public static SharedPreferences provideSharedPreference(@ApplicationContext Context context) {
        return context.getSharedPreferences("edenglish.preference", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    public static PreferenceManager providePreferenceManager(SharedPreferences sharedPreferences) {
        return new PreferenceManager(sharedPreferences);
    }
}