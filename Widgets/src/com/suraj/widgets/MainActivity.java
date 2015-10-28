package com.suraj                                          .widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener {
	
	RadioButton radiobuttonoption1;
	RadioGroup radiogroup;
	CheckBox box1,box2;
	ToggleButton tog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radiobuttonoption1=(RadioButton) findViewById(R.id.radioButtonOption1);
        radiogroup=(RadioGroup) findViewById(R.id.radioGroup1);
        radiogroup.setOnCheckedChangeListener(MainActivity.this);
        box1=(CheckBox) findViewById(R.id.checkBox1);
        box2=(CheckBox) findViewById(R.id.checkBox2);
        tog1=(ToggleButton) findViewById(R.id.toggleButton1);
        //this is for option
        box1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if(arg1)
				{
					Toast.makeText(MainActivity.this, "You have selected check1", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(MainActivity.this, "You have unselected check1", Toast.LENGTH_SHORT).show();
				}
			}
		});
 box2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if(arg1)
				{
					Toast.makeText(MainActivity.this, "You have selected check2", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(MainActivity.this, "You have unselected check2", Toast.LENGTH_SHORT).show();
				}
			}
		});
tog1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
			if(arg1)
			{
				Toast.makeText(MainActivity.this, "You have selected on", Toast.LENGTH_SHORT).show();
			}
			else{
				Toast.makeText(MainActivity.this, "You have unselected off", Toast.LENGTH_SHORT).show();
			}
		}
	});
        
        radiobuttonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				
				if(state==true)
				{
					Toast.makeText(MainActivity.this, "You have selected option1", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        
    }

	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) {
		switch(id){
		case R.id.radioSelection1:
			Toast.makeText(MainActivity.this, "You have selected selection1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioSelection2:
			Toast.makeText(MainActivity.this, "You have selected selection2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioSelection3:
			Toast.makeText(MainActivity.this, "You have selected selection3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioSelection4:
			Toast.makeText(MainActivity.this, "You have selected selection4", Toast.LENGTH_SHORT).show();
			break;
		}
		
	}
    
}
    
