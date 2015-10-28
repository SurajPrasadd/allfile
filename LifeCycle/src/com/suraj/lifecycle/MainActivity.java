package com.suraj.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
	protected void onStart() {
    	 Toast.makeText(MainActivity.this, "onStart()",Toast.LENGTH_SHORT).show();
		super.onStart();
	}
    
	@Override
	protected void onResume() {
		 Toast.makeText(MainActivity.this, "onResume()",Toast.LENGTH_SHORT).show();
		super.onResume();
	}


	@Override
	protected void onPause() {
		 Toast.makeText(MainActivity.this, "onPause()",Toast.LENGTH_SHORT).show();
		super.onPause();
	}


	@Override
	protected void onRestart() {
		 Toast.makeText(MainActivity.this, "onRestart()",Toast.LENGTH_SHORT).show();
		super.onRestart();
	}



	@Override
	protected void onStop() {
		 Toast.makeText(MainActivity.this, "onStop()",Toast.LENGTH_SHORT).show();
		super.onStop();
	}
	
    @Override
	protected void onDestroy() {
    	 Toast.makeText(MainActivity.this, "onDestroy()",Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}
    
}
