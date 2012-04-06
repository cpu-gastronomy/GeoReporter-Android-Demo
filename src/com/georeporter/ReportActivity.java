package com.georeporter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.AdapterView.OnItemClickListener;

public class ReportActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] groups = getResources().getStringArray(R.array.groups);
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.report_layout, groups));
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String selected = ((TextView) view).getText().toString();
				Log.d("ReportActivity", "The value of selected is : " + selected);
				showNextList(selected);
			}
		});

	}

	public void showNextList(String itemSelected) {
		if(itemSelected.equals("General")){
			Intent intent = new Intent(this, GeneralServiceActivity.class);
			startActivity(intent);
		}
		else if (itemSelected.equals("Snow")){
			Intent intent = new Intent(this, SnowServiceActivity.class);
			startActivity(intent);
		}
		
	}
}