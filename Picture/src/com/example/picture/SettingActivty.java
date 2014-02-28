package com.example.picture;
import com.example.picture.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class SettingActivty extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.prefs);
    }
   
}
