package com.example.broadcastdemo1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.provider.Settings;

public class MyService extends Service {

    MediaPlayer mplayer;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        mplayer= MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mplayer.start();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        mplayer.stop();
        super.onDestroy();
    }
}