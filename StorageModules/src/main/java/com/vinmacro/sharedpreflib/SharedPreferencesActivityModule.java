package com.vinmacro.sharedpreflib;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPreferencesActivityModule {

    private Activity activity;

    public SharedPreferencesActivityModule(Activity activity) {
        this.activity = activity;
    }


    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(activity);
    }


//    @Singleton
//    @Provides
//    public Activity provideActivity() {
//        return activity;
//    }
//
//    @Singleton
//    @Provides
//    SharedPreferences provideSharedPreferences(Activity activity) {
//        return PreferenceManager.getDefaultSharedPreferences(activity);
//    }


}
