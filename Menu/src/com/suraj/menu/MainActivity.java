package com.suraj.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button b;
	EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.buttoncontext);
        ed=(EditText) findViewById(R.id.editText1);
        registerForContextMenu(b);
    }
   
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	getMenuInflater().inflate(R.menu.main, menu);
    	menu.setHeaderTitle("select");
    	super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    	switch(item.getItemId()){
    	case R.id.SMS:
    		
    		
    		String input=ed.getText().toString();
    		Intent intent=new Intent(Intent.ACTION_SEND);
    		intent.setType("text/plain");
    		intent.putExtra(Intent.EXTRA_TEXT, input);
    		startActivity(Intent.createChooser(intent, "share by"));
    		
    		break;
    	case R.id.Call:
    		
    		break;
    	}
    	return super.onContextItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    
        getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
    }
    
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	if(item.getItemId()==R.id.Share){
    		
    		
    		Toast.makeText(MainActivity.this,"u have clicked on share button", Toast.LENGTH_SHORT).show();
    	}
    	return super.onOptionsItemSelected(item);
    	
    }
    
}
