package com.example.a16022706.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMod =(ListView) this.findViewById(R.id.lvModule);

        String module[]=new String[]{"C347"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, module );
        lvMod.setAdapter(adapter);

        lvMod.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {

                String moduleValues=(String)lvMod.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                intent.putExtra("code", moduleValues);
                startActivity(intent);
            }
        });
    }
}
