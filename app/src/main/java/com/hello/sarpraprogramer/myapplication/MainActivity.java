package com.hello.sarpraprogramer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*logt lalu tab */
    //private static final String TAG = "MainActivity";
    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText eNama;
    private EditText ePassword;
    private EditText eAlamat;
    private EditText eTlp;
    private EditText eEmail;
    private RadioButton rbLaki;
    private RadioButton rbPerempuan;
    private String jk;
    public static final String pesan = "pesanku";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: sudah create");
        rbLaki = (RadioButton) findViewById(R.id.RBLaki);
        rbPerempuan = (RadioButton) findViewById(R.id.RBPerempuan);
        ePassword = (EditText) findViewById(R.id.ePassword);
        eAlamat = (EditText) findViewById(R.id.eAlamat);
        eTlp = (EditText) findViewById(R.id.eTlp);
        eEmail = (EditText) findViewById(R.id.eEmail);
        eNama = (EditText) findViewById(R.id.eNama);
        Button bOK = (Button) findViewById(R.id.bOK);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pOK();

            }
        });
    }

    private void pOK() {


        Toast.makeText(MainActivity.this, getString(R.string.data_tersimapan)
                , Toast.LENGTH_SHORT).show();
        Log.d(TAG, "ok: sudah klik ok");
        Log.d(TAG, "ok: sudah data :" + eNama.getText().toString() + ';' + jk);

        Intent intent = new Intent(this,KonfirmActivity.class);
        intent.putExtra(pesan,eNama.getText().toString());
        startActivity(intent);
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

    public void cRBLaki(View view) {
        if (rbLaki.isChecked()) {
            rbPerempuan.setChecked(false);
            jk = "Laki-laki";
        }
    }

    public void cRBPerempuan(View view) {
        if (rbPerempuan.isChecked()) {
            rbLaki.setChecked(false);
            jk = "Perempuan";
        }

    }

    public void cBatal(View view) {
        Toast.makeText(this, "Batal", Toast.LENGTH_SHORT).show();
    }
}
