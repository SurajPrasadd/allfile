package com.example.gha;



import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button nextpagebutton,b;
	ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextpagebutton=(Button) findViewById(R.id.button1);
        b=(Button) findViewById(R.id.button2);
      
        
        
        
        nextpagebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, 1313);
			}
		});
    }


    @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==1313)
		{
			if(resultCode==RESULT_OK)
			{
				Bitmap bm=(Bitmap) data.getExtras().get("data");
			//im.setImageBitmap(bm);
			
			Intent inte=new Intent(MainActivity.this,SecondActivity.class);
			inte.putExtra("BitmapImage", bm);
			startActivity(inte);
			
			}
			
		}
	}

    }
    

