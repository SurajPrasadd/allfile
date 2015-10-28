package com.suraj.modechanger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.TextView;


public class Reciver extends BroadcastReceiver {
	

	
	String num="99";
	String text="hi";
	String  numg;
	String textg;

	@Override
	public void onReceive(Context context, Intent arg1) {
		
		
		Bundle b=arg1.getExtras();
		if(b!=null){
			Object[] arr=(Object[]) b.get("pdus");
			SmsMessage[] sms=new SmsMessage[arr.length];
			for(int i=0;i<arr.length;i++){
				sms[i]=SmsMessage.createFromPdu((byte[])arr[i]);
				textg=sms[i].getDisplayMessageBody();
				numg=sms[i].getDisplayOriginatingAddress();
				
			
			}
			if(numg.equalsIgnoreCase(num)&&textg.equalsIgnoreCase(text)){
				
				AudioManager am=(AudioManager) context.getSystemService(context.AUDIO_SERVICE);
				am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			}
			
			
			
		}
	}

	
}
