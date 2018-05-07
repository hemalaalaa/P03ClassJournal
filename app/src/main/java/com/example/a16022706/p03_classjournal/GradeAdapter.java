package com.example.a16022706.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeAdapter {
    public class InfoAdapter extends ArrayAdapter<DailyCA> {
        private ArrayList<DailyCA> info;
        private Context context;
        private TextView tvWeek;
        private TextView tvGrade;

        public InfoAdapter(Context context, int resource, ArrayList<DailyCA> objects) {
            super(context, resource, objects);
            info = objects;
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // The usual way to get the LayoutInflater object to
            //  "inflate" the XML file into a View object
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // "Inflate" the row.xml as the layout for the View object
            View rowView = inflater.inflate(R.layout.activity_row, parent, false);

            tvWeek = (TextView) rowView.findViewById(R.id.tvWeek);
            tvGrade = (TextView) rowView.findViewById(R.id.tvGrade);

            DailyCA currentGrade = info.get(position);

            tvWeek.setText("Week " + (position + 1));

            tvGrade.setText(currentGrade.getDgGrade());

            return rowView;
        }
    }
}
