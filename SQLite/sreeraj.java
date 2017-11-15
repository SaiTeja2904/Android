package example.sai.sqlitedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class sreeraj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sreeraj);
        Intent i=getIntent();
        String s=i.getStringExtra("user");
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }
}
