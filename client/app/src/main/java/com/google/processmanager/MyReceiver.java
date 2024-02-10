package com.google.processmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // Launch App On Phone Reboot
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            // Start your app's service or activity here
            Intent serviceIntent = new Intent(context, MainService.class);
            context.startService(serviceIntent);
            Log.d("ACTION_BOOT_COMPLETED", "MainService Start");
        }

    }
}
