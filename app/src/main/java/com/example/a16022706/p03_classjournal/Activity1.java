package com.example.a16022706.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {
    int requestCodeForAdd = 1;

    ListView lv;
    Button btnInfo;
    Button btnAdd;
    Button btnEmail;
    ArrayAdapter aa;
    ArrayList<DailyCA> grade;
    String module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        grade = new ArrayList<DailyCA>();
        lv = (ListView) this.findViewById(R.id.listview);
        btnInfo = (Button) findViewById(R.id.buttonInfo);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnEmail = (Button) findViewById(R.id.btnEmail);

        Intent i = getIntent();
        String code = i.getStringExtra("code");
        getSupportActionBar().setTitle("Info for " + code);
        module = code;

        if (code.equalsIgnoreCase("C347")) {
            grade.add(new DailyCA(1, "B"));
            grade.add(new DailyCA(2, "C"));
            grade.add(new DailyCA(3, "A"));
        } else if (code.equalsIgnoreCase("C302")) {
            grade.add(new DailyCA(1, "E"));
        }
        aa = new GradeAdapter(this, R.layout.activity_row, grade);
        lv.setAdapter(aa);


        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });

    }
}
