package com.example.picture;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent(Activity2.this, Activity3.class);
				startActivity(intent);
			}
		});
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		TextView tv = (TextView)findViewById(R.id.textView1);
		boolean check = prefs.getBoolean("checkbox2", true);
		if (check == true)
			tv.setTextAppearance(this,R.style.alternative);
		else
			tv.setTextAppearance(this, R.style.defaul);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

}
