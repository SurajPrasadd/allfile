package com.suraj.audioplay;

import android.app.Service;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Reciver extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		super.onCreate();
		MediaPlayer mp=MediaPlayer.create(Reciver.this,R.id. )
		
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		d.start();
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		d.stop();
	}

	
}
