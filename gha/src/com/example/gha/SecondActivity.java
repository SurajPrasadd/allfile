package com.example.gha;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.widget.ImageView;

public class SecondActivity extends Activity {
	ImageView im;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		im=(ImageView) findViewById(R.id.imageView53);
		
		Intent i=getIntent();
		Bitmap b =i.getParcelableExtra("BitmapImage");
		im.setImageBitmap(b);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
