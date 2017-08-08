package com.hello.sarpraprogramer.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*logt lalu tab */
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*ctrl + shift + / shortcut comment multi baris*/
   /*ctrl o keluar override*/
    @Override
    protected void onStart() {
        super.onStart();
         /*logd lalu tab */
        Log.d(TAG, "onStart: sudah start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: sudah resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: sudah pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: sudah restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: sudah stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: sudah destroy");
    }
}
