package com.google.firebase.codelab.friendlychat;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by juanocampo on 5/30/17.
 */

public class MyApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
