package com.example.saiteja.sharedpreferencesexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName,password,phoneNumber,eMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void saveData(View view) {
        userName=(EditText)findViewById(R.id.uname);
        password=(EditText)findViewById(R.id.pwd);
        phoneNumber=(EditText)findViewById(R.id.phno);
        eMail=(EditText)findViewById(R.id.email);

        String val_userName=userName.getText().toString();
        String val_pwd=password.getText().toString();
        String val_phone=phoneNumber.getText().toString();
        String val_email=eMail.getText().toString();

        SharedPreferences sharedPreferences=getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(getResources().getString(R.string.user),val_userName);
        editor.putString("Pass",val_pwd);
        editor.putString("Phone",val_phone);
        editor.putString("Email",val_email);
        editor.commit();
        startActivity(new Intent(this,Display.class));
    }
}
