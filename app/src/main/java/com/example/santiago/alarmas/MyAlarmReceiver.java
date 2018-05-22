package com.example.santiago.alarmas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyAlarmReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "ALARM",
                    Toast.LENGTH_LONG).show();
    }
}
