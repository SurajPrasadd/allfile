package com.suraj.custom;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button1);
        
    }


  public void pagebui(View v){
	  View v1;
	  AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
	  builder.setTitle("login");
	  LayoutInflater inflater=getLayoutInflater();
	  v1 = inflater.inflate(R.layout.loginpage,null);
	    builder.setView(v1);
	    
	    builder.setPositiveButton("Login", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				
			}
		});
	    
	    builder.setNegativeButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    AlertDialog dialog = builder.create();
		dialog.show();
	   
  }
}
