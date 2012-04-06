package com.georeporter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
        
    }
    
    
    public void aboutButtonClick(View view){
    	Intent intent = new Intent(this, AboutActivity.class);
    	startActivity(intent);
    }
}
