package com.csivit.intranet.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Event> AllEvents = new ArrayList<>();

    private static SharedPreferences sharedPreferences;
    private static boolean loggedIn;
    private static String authToken;
    private static String accessToken;

    public static void initialize(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
        loggedIn = sharedPreferences.getBoolean(Constants.LOGGED_IN_KEY, false);
        authToken = sharedPreferences.getString(Constants.AUTH_TOKEN_KEY, "");
        accessToken = sharedPreferences.getString(Constants.ACCESS_TOKEN_KEY, "");
    }

    public static void save() {
        sharedPreferences.edit()
                .putBoolean(Constants.LOGGED_IN_KEY, loggedIn)
                .putString(Constants.AUTH_TOKEN_KEY, authToken)
                .putString(Constants.ACCESS_TOKEN_KEY, accessToken)
                .apply();
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Data.loggedIn = loggedIn;
    }

    public static String getAuthToken() {
        return authToken;
    }

    public static void setAuthToken(String authToken) {
        Data.authToken = authToken;
    }

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        Data.accessToken = accessToken;
    }

    public static class Event {
        public String title;
        public String organisedBy;
        public String date;
    }
}
