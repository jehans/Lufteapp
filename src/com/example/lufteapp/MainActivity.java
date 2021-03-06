package com.example.lufteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void openMap(View view) {
		Intent intent = new Intent(this, ViewMap.class);
		startActivity(intent);
	}
	
	public void openLog(View view) {
		Intent intent = new Intent(this, ActivityLog.class);
		startActivity(intent);
	}
	
	public void checkIn(View view) {
		Intent intent = new Intent(this, GpsData.class);
		startActivity(intent);
	}
}