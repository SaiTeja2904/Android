package example.sai.dynamiclist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView name_tv,phone_tv,gender_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name_tv=(TextView)findViewById(R.id.name);
        phone_tv=(TextView)findViewById(R.id.phone);
        gender_tv=(TextView)findViewById(R.id.gender);

        Intent i=getIntent();
        name_tv.setText(name_tv.getText().toString()+i.getStringExtra("name"));
        phone_tv.setText(phone_tv.getText().toString()+i.getStringExtra("phone"));
        gender_tv.setText(gender_tv.getText().toString()+i.getStringExtra("gender"));
    }
}
