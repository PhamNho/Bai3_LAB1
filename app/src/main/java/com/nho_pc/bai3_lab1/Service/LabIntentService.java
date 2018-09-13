package com.nho_pc.bai3_lab1.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class LabIntentService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle bundle=intent.getBundleExtra("Text");

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
