package com.suraj.contacthelper;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	ListView contact;
	Intent intent=new Intent(Intent.ACTION_DIAL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact=(ListView) findViewById(R.id.listView1);
        
       
        
        String[] name={"Rakesh Sharma","Mukesh Kumar","Eshwar Gowda","Deeman Gowda","Sonu Prasad"};
       String[] number={"9342614182","9845156895","8562356987","8569453698","8756953642"};
        final Bundle cont=new Bundle();
        
        cont.putStringArray("key", number);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, name);
        contact.setAdapter(adapter);
        
        contact.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				switch (position) {
				case 0:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 1", Toast.LENGTH_SHORT).show();
					
					break;
				case 1:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 2", Toast.LENGTH_SHORT).show();
					
					break;
				case 2:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 3", Toast.LENGTH_SHORT).show();
					
					break;
				case 3:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 4", Toast.LENGTH_SHORT).show();
					
					break;
				case 4:
					daill(position);
					//Toast.makeText(MainActivity.this, "selection 5", Toast.LENGTH_SHORT).show();
					
					break;

				}
				
			}

			private void daill(int position) {
				/*
				 * 
				 * Author=Suraj Prasad
				 * Argument=take position in a listview
				 * implimentation=according to position dail number
				 *doc=7/10/2015
				 * 
				 * 
				 */
				
				String[] l=cont.getStringArray("key");
				
				intent.setData(Uri.parse("tel:"+l[position]));
				startActivity(intent);
				
			}
		});
       
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
