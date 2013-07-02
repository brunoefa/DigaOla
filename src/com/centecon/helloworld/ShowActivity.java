package com.centecon.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		
		Intent intent = getIntent();
		String nome = intent.getStringExtra("nome");
		TextView textView = (TextView)findViewById(R.id.textViewShowName);
		textView.setText("Olá " + nome);
		Log.i("MAIN","onCreate");
	}
	
	@Override
	protected void onStart() {
		Log.i("MAIN","onStart");
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		Log.i("MAIN","onResume");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Log.i("MAIN","onPause");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Log.i("MAIN","onStop");
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		Log.i("MAIN","onDestroy");
		super.onDestroy();
	}
	
	@Override
	protected void onRestart() {
		Log.i("MAIN","onRestart");
		super.onRestart();
	}

}
