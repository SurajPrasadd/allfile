package com.suraj.captureimg;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.widget.ImageView;

public class SecondActivity extends Activity {


	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		image=(ImageView) findViewById(R.id.imageView1);
		
		Intent intent=getIntent();
		Bitmap bitmap=(Bitmap) intent.getParcelableExtra("BitmapImage");
		image.setImageBitmap(bitmap);
		 
	}

}
