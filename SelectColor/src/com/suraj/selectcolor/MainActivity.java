package com.suraj.selectcolor;

import java.util.ArrayList;
import java.util.Iterator;

import android.os.Bundle;
import android.provider.AlarmClock;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	
	Button color;
	TextView t1,t2;
	
	
	String[] s={"Red","Green","Blue"};
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        color=(Button) findViewById(R.id.buttoncolor);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.textView2);
        
       
      
        
        
    }
       public  void choice(View v){
    	  
    	   t1.setText(" ");
    	
    	   
    	   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
    	   
    	   builder.setTitle("Choose your color");
    	  final ArrayList list  = new ArrayList();
    	   builder.setMultiChoiceItems(s,null, new OnMultiChoiceClickListener() {
    		
    		@Override
    		public void onClick(DialogInterface arg0, int id, boolean arg2) 
    		{
    			
    			if(arg2==true)
    			{
    				list.add(id);
    				
    			}
    			
    			else if(list.contains(id))
    			{
    				list.remove(id);
    			}
    			
    		}
    	});
    	   builder.setPositiveButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				int a=0;
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<list.size();i++){
					 a=(Integer) list.get(i);
					 if(i==1 || i==2){
							sb.append(",");
						}
					sb.append(s[a]);
					
					a++;
					
					//t1.setText(s[a]);
					
					
					 }
				t2.setText("Color which You have Selected");
				t1.setText(sb.toString());
			//	int a=list.size();
			//		Toast.makeText(MainActivity.this,a+"", Toast.LENGTH_SHORT).show();
				
				
			}
		});
    	   builder.setNegativeButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				arg0.dismiss();
				
			}
		});
    	 AlertDialog dialog = builder.create();
    	  dialog.show();
    	 
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if(keyCode==KeyEvent.KEYCODE_BACK){
    		
    		AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
    		
    		//builder.setTitle("Select one or more colors");
    		builder.setTitle("Exit");
    		builder.setMessage("Do you want to exit?");
    		builder.setPositiveButton("Yes", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					
					finish();
				}
			});
    		builder.setNegativeButton("No", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					
					arg0.dismiss();
					
				}
			});
    		AlertDialog ad=builder.create();
    		ad.show();
    	}
		
    		
    	return true;
    		//return false;
    	
    	
    }


    
}
