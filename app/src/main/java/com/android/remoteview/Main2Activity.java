package com.android.remoteview;

import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.os.Bundle;

public class Main2Activity extends PreferenceActivity {

    private static final String KEY_WIFI = "switch_wifi";
    private static final String KEY_BLUETOOTH = "switch_bluetooth";
    private static final String KEY_SYSTEM = "switch_system";

    SwitchPreference switch_wifi;
    SwitchPreference switch_bluetooth;
//    PreferenceScreen switch_system;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        addPreferencesFromResource(R.xml.preference_settings);
        final PreferenceScreen root = getPreferenceScreen();

        switch_wifi = (SwitchPreference) root.findPreference(KEY_WIFI);
        switch_bluetooth = (SwitchPreference) root.findPreference(KEY_BLUETOOTH);
        //switch_system = (PreferenceScreen) root.findPreference(KEY_SYSTEM);

        switch_wifi.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                final boolean val = (boolean) newValue;
                // TODO: 2017/6/15 do something
                return true;
            }
        });

        switch_bluetooth.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                final boolean val = (boolean) newValue;
                // TODO: 2017/6/15 do something
                return true;
            }
        });

    }
}
