package com.google.android.apps.miphone.aiai.actions.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ActionRankingDataTtlService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
