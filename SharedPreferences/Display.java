package com.example.saiteja.sharedpreferencesexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        SharedPreferences sharedPreferences=getSharedPreferences("myPref", Context.MODE_PRIVATE);
        String uname=sharedPreferences.getString("User_Name","");
        String pwd=sharedPreferences.getString("Pass","");
        String phone=sharedPreferences.getString("Phone","");
        String email=sharedPreferences.getString("Email","");
        TextView user=(TextView)findViewById(R.id.user_text);
        TextView password=(TextView)findViewById(R.id.pwd_text);
        TextView number=(TextView)findViewById(R.id.phone_text);
        TextView mail=(TextView)findViewById(R.id.email_text);
        user.setText("UserName: "+uname);
        password.setText("PassWord: "+pwd);
        number.setText("Phone Number: "+phone);
        mail.setText("E-Mail: "+email);
    }
}
