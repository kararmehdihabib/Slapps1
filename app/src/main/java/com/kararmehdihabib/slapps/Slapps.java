package com.kararmehdihabib.slapps;

import android.app.Application;
import com.parse.Parse;

public class Slapps extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "cKpV06JoFPeh7Np7IIQy4Exso6Nhn6x9os3fCKZL", "AZsxf4hxsgVTPnpIq3M8x0VMuyGuL3EUUyMeK5BF");
    }
}
