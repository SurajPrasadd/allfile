package com.suraj.popup;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class MainActivity extends Activity {
	
	Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				  PopupMenu p=new PopupMenu(MainActivity.this,b);
			        getMenuInflater().inflate(R.menu.popup,p.getMenu());
			        p.setOnMenuItemClickListener(new OnMenuItemClickListener() {
						
						@Override
						public boolean onMenuItemClick(MenuItem arg0) {
							switch(arg0.getItemId()){
							case R.id.item1:
							}
							return false;
						}
					});
			        p.show();
				
			}
		}); 
      
        
    }

    
}
