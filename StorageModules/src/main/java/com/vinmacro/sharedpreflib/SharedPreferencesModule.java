package com.vinmacro.sharedpreflib;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class SharedPreferencesModule {

//    private Context context;
//
//
//    public SharedPref(Context context){
//        this.context = context;
//    }
//
//    @Singleton
//    @Provides
//    public Context provideContext() {
//        return context;
//    }
//
//    @Singleton
//    @Provides
//    public SharedPreferences provideSharedPreferences(Context context) {
//        return PreferenceManager.getDefaultSharedPreferences(context);
//    }



    private Activity activity;

    public SharedPreferencesModule(Activity activity) {
        this.activity = activity;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(activity);
    }
}
