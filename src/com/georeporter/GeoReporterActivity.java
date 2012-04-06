package com.georeporter;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class GeoReporterActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        TabHost tabHost = getTabHost();
        
        // Tab for Home
        TabSpec homeSpec = tabHost.newTabSpec("Home");
        // setting Title and Icon for the Tab
        homeSpec.setIndicator("Home", getResources().getDrawable(R.drawable.home_w));
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homeSpec.setContent(homeIntent);
 
        // Tab for Report
        TabSpec reportSpec = tabHost.newTabSpec("Report");
        reportSpec.setIndicator("Report", getResources().getDrawable(R.drawable.report));
        Intent reportIntent = new Intent(this, ReportActivity.class);
        reportSpec.setContent(reportIntent);
 
        // Tab for My Reports
        TabSpec myReportsSpec = tabHost.newTabSpec("My Reports");
        myReportsSpec.setIndicator("My Reports", getResources().getDrawable(R.drawable.list));
        Intent myReportsIntent = new Intent(this, MyReportsActivity.class);
        myReportsSpec.setContent(myReportsIntent);
        
        // Tab for Report To
        TabSpec reportToSpec = tabHost.newTabSpec("Report To");
        reportToSpec.setIndicator("Report To", getResources().getDrawable(R.drawable.megaphone));
        Intent reportToIntent = new Intent(this, ReportToActivity.class);
        reportToSpec.setContent(reportToIntent);
 
        // Adding all TabSpec to TabHost
        tabHost.addTab(homeSpec); // Adding Home tab
        tabHost.addTab(reportSpec); // Adding Report tab
        tabHost.addTab(myReportsSpec); // Adding My Reports tab
        tabHost.addTab(reportToSpec); // Adding Report To tab
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    
    // Method used when selecting an item in the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item_settings:
                showSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    public void showSettings() {
    	Intent intent = new Intent(this, SettingsActivity.class);
    	startActivity(intent);
    }
    
}