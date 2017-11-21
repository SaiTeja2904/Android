package com.example.saiteja.servicesexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPlaying(View view) {
        Intent intent=new Intent(this,ServiceMain.class);
        startService(intent);
    }

    public void stopPlaying(View view) {
        Intent intent=new Intent(this,ServiceMain.class);
        stopService(intent);
    }
}
