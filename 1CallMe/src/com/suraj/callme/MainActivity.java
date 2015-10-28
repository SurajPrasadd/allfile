package com.suraj.callme;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button start,stop;
	TextView state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        start=(Button) findViewById(R.id.buttonstart);
        stop=(Button) findViewById(R.id.buttonstop);
        state=(TextView) findViewById(R.id.textViewstate);
        
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				state.setText("started");
				startService(new Intent(getBaseContext(), VoiceRec.class));
				
			}
		});
 stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				state.setText("stop");
				stopService(new Intent(getBaseContext(), VoiceRec.class));
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
