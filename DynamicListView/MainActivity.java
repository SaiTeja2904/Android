package example.sai.dynamiclist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] names;
    String[] genders;
    String[] phones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         names=new String[]{"Sai Teja","Prabhas","Tamanna","Anushka","NTR","PK","Samantha"};
         genders=new String[]{"Male","Male","Female","Female","Male","Male","Female"};
         phones=new String[]{"7396517722","8121137988","9701444380","9963713396","7036000354","8688212374","8247421803"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,names);
        ListView lv=(ListView)findViewById(R.id.listView);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name=names[position];
                String gender=genders[position];
                String phone=phones[position];
                Intent i=new Intent(MainActivity.this,Display.class);
                i.putExtra("name",name);
                i.putExtra("gender",gender);
                i.putExtra("phone",phone);
                startActivity(i);

            }
        });
    }
}
