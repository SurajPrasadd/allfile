package com.suraj.callme;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class VoiceRec extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		super.onCreate();
		Toast.makeText(VoiceRec.this, "on create", Toast.LENGTH_SHORT).show();
		
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		
		Toast.makeText(VoiceRec.this, "on create", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(VoiceRec.this, "on create", Toast.LENGTH_SHORT).show();
	}

}
