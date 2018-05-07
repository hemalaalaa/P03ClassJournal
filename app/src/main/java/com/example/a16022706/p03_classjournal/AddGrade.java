package com.example.a16022706.p03_classjournal;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddGrade extends AppCompatActivity {

    TextView tvWeek;
    TextView tvGrade;
    RadioGroup rg;
    Button btnSubmit;
    RadioButton radioB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();

        tvWeek = (TextView)findViewById(R.id.tvWeek);
        tvGrade = (TextView)findViewById(R.id.tvGrade);
        btnSubmit = (Button)findViewById(R.id.buttonSubmit);

        final int week = i.getIntExtra("", 0);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                rg = (RadioGroup)findViewById(R.id.rg);
                int selectedButtonId = rg.getCheckedRadioButtonId();
                radioB = (RadioButton)findViewById(selectedButtonId);

                DailyCA weekG = new DailyCA(week, radioB.getText().toString());
                Intent i = getIntent();
                i.putExtra("dataKey", weekG);
                setResult(RESULT_OK);
                finish();
                /*
                Hero batman = new Hero("Batman", 60, 90);
		        Intent i = new Intent(MainActivity.this, 						HeroStatsActivity.class);
		        i.putExtra("hero", batman);

                 */


        }});
    }

}
