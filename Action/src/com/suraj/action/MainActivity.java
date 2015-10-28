package com.suraj.action;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button call,dail,google;
	EditText t1,t2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button) findViewById(R.id.button2);
        dail=(Button) findViewById(R.id.button1);
        google=(Button) findViewById(R.id.button3);
        
        t1=(EditText) findViewById(R.id.editText1);
        t2=(EditText) findViewById(R.id.editText2);
        
        dail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_DIAL);
				
				intent.setData(Uri.parse("tel:"+t1.getText().toString()));
				startActivity(intent);
				
			}
		});
 call.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_CALL);
				
				intent.setData(Uri.parse("tel:"+"8197818801"));
				//t2.getText().toString()));
				startActivity(intent);
				
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
