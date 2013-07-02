package com.centecon.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private String nomeDigitado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.e("MAIN","onCreate");
	}
	
	@Override
	protected void onStart() {
		Log.e("MAIN","onStart");
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		Log.e("MAIN","onResume");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Log.e("MAIN","onPause");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Log.e("MAIN","onStop");
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		Log.e("MAIN","onDestroy");
		super.onDestroy();
	}
	
	@Override
	protected void onRestart() {
		Log.e("MAIN","onRestart");
		super.onRestart();
	}
	
	public void digaOla(View view) {
		EditText campoNome = (EditText)findViewById(R.id.campoNome);
		nomeDigitado = campoNome.getText().toString();
		
		Intent intent = new Intent(this, ShowActivity.class);
		intent.putExtra("nome", nomeDigitado);
		startActivity(intent);
	}
	
}
















