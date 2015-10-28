package com.suraj.collect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button nextpage;
	TextView collect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nextpage=(Button) findViewById(R.id.button);
        collect=(TextView) findViewById(R.id.textView);
        
        nextpage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(intent, 1);
				
				
			}
		});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	
    	super.onActivityResult(requestCode, resultCode, data);
    	if(resultCode==RESULT_OK){
    		Bundle b1=data.getExtras();
    		String s=b1.getString("key1");
    		collect.setText(s);
    	}
    	else if(resultCode==RESULT_CANCELED){
    		collect.setText("ERROR");
    	}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
