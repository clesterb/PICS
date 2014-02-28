package com.example.picture;

import com.example.picture.*;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent (MainActivity.this, Activity2.class);
				startActivity(intent);
			}
		});
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		TextView tv = (TextView)findViewById(R.id.textView1);
		boolean check = prefs.getBoolean("checkbox1", true);
		if (check == true)
			tv.setTextAppearance(this,R.style.alternative);
		else
			tv.setTextAppearance(this, R.style.defaul);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);		
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		    // Handle item selection
		    switch (item.getItemId()) {
		        case R.id.action_settings:
		        	Intent intent = new Intent (this, SettingActivty.class);
					startActivity(intent);
			default:
		            return super.onOptionsItemSelected(item);
		    }
		}
	
	
}
	
	
	


