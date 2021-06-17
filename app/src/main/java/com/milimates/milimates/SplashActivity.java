package com.milimates.milimates;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    private static int progress;
    private int progressStatus = 0;
    private Handler handler = new Handler();
    private PowerManager.WakeLock wl;
    @SuppressLint("InvalidWakeLockTag")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, "DoNotDimScreen");
        progress = 0;

        new Thread(new Runnable() {
            public void run() {
                // ---do some work here---
                while (progressStatus < 100) {
                    progressStatus = doSomeWork();
                    // ---Update the progress bar---
                    handler.post(new Runnable() {
                        public void run() {

                        }
                    });
                }
                // ---hides the progress bar---
                handler.post(new Runnable() {
                    // @SuppressLint("ParserError")
                    public void run() {
                        finish();



                        Intent intent = new Intent(SplashActivity.this,
                                    MainActivity.class);
                        startActivity(intent);


                        overridePendingTransition(R.anim.push_up_out,R.anim.push_up_in);
                    }
                });
            }
            private int doSomeWork() {
                try {
                    // ---simulate doing some work---
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return ++progress;
            }
        }).start();


    }

}