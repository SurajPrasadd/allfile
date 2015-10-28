package com.suraj.donors;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	ProgressBar bar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        bar.setVisibility(View.VISIBLE); 
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
