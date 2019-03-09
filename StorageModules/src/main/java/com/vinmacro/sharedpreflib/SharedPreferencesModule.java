package com.vinmacro.sharedpreflib;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


public class SharedPreferencesModule {

    @Module
    public class ContextAsParam {

        private Context context;

        public ContextAsParam(Context context) {
            this.context = context;
        }

        @Singleton
        @Provides
        public Context provideContext() {
            return context;
        }

        @Singleton
        @Provides
        public SharedPreferences provideSharedPreferences(Context context) {
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    @Module
    public class ActivityAsParam {
        private Activity activity;

        public ActivityAsParam(Activity activity) {
            this.activity = activity;
        }

        @Singleton
        @Provides
        SharedPreferences provideSharedPreferences() {
            return PreferenceManager.getDefaultSharedPreferences(activity);
        }
    }

}
