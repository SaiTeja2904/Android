package example.sai.sqlitedemo;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       db= openOrCreateDatabase("mid2",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS LOGIN(USERNAME VARCHAR,PASSWORD VARCHAR);");
        db.execSQL("insert into login values('abc','abc');");
        db.execSQL("insert into login values('123','123');");
        db.execSQL("insert into login values('dfd','dfd');");
    }
    public void login(View v)
    {   flag=false;
        EditText text=(EditText) findViewById(R.id.editText);
        String uname=text.getText().toString();
        EditText passer =(EditText) findViewById(R.id.editText3);
        String pass =passer.getText().toString();
        Cursor set= db.rawQuery("select * from login;",null);
        set.moveToFirst();
        do
        {

            if(pass.equals(set.getString(1))&& (uname.equals(set.getString(0)))){
            flag=true;
            }}while(set.moveToNext());



        if (flag){    Toast.makeText(MainActivity.this, "masth kotinav", Toast.LENGTH_SHORT).show();
            Intent it=new Intent(this,sreeraj.class);
            it.putExtra("user",uname);
            startActivity(it);
        }
        else{
            Toast.makeText(MainActivity.this, " please correct", Toast.LENGTH_SHORT).show();
        }

    }
}
