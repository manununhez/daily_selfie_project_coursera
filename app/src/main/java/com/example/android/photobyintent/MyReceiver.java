package com.example.android.photobyintent;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    NotificationManager nm;

    @Override
    public void onReceive(Context context, Intent intent) {
        nm = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        CharSequence from = "Daily Selfie Alarm";
        CharSequence message = "You have to take a selfie right now...";
        Intent phoneIntent = new Intent(context, PhotoIntentActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                phoneIntent, 0);
        Notification notification = new Notification(R.drawable.icon,
                "Daily Selfie Alarm", System.currentTimeMillis());
        notification.flags = Notification.DEFAULT_LIGHTS | Notification.FLAG_AUTO_CANCEL;
        notification.setLatestEventInfo(context, from, message, contentIntent);
        nm.notify(1, notification);
    }

}
