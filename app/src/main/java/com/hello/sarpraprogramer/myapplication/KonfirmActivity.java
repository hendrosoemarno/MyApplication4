package com.hello.sarpraprogramer.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KonfirmActivity extends AppCompatActivity {

    private EditText eNama;
    private Button bOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirm);
        bOK= (Button) findViewById(R.id.bOK);

        Intent intent = getIntent();
        String data = intent.getStringExtra(MainActivity.pesan);
        eNama = (EditText) findViewById(R.id.eNama);
        eNama.setText(data);
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_moklet,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch(itemId){
            case R.id.share:
                share();
                break;
            case R.id.logout:
                Toast.makeText(KonfirmActivity.this,"log out",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    private void share() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        //startActivity(sendIntent);
        startActivity(Intent.createChooser(sendIntent,"coba" ));
        Toast.makeText(KonfirmActivity.this,"share",Toast.LENGTH_SHORT).show();
    }

    public void iCall(View view) {
        Toast.makeText(this,"iCall",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "085101442463"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void iMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=amaris setiabudi bandung%2C+CA"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
