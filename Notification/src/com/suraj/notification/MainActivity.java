package com.suraj.notification;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

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
				NotificationCompat.Builder n=new Builder(MainActivity.this);
				n.setTicker("1 new massage");
				n.setContentTitle("mass");
				n.setContentText("hi how r u");
				n.setSmallIcon(R.drawable.ic_launcher);
				Toast.makeText(MainActivity.this,"hiii", Toast.LENGTH_SHORT).show();
				
				
				
				
				
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				TaskStackBuilder tb=TaskStackBuilder.create(MainActivity.this);
				tb.addParentStack(SecondActivity.class);
				tb.addNextIntent(intent);
				PendingIntent pi=tb.getPendingIntent(1, PendingIntent.FLAG_UPDATE_CURRENT);
				n.setContentIntent(pi);
				
				
				
				Notification no=n.build();
				NotificationManager hi=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				hi.notify(1,no);
				
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
