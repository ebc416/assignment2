package com.example.homework_attempts.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.homework_attempts.R;
import com.example.homework_attempts.model.DatabaseStudent_Course;
import com.example.homework_attempts.model.Student;

import org.w3c.dom.Text;

public class SummaryAdapter extends BaseAdapter {
    @Override
    public int getCount(){
        return DatabaseStudent_Course.getInstance().getStudents().size();
    }

    @Override
    public Object getItem(int position){
        return DatabaseStudent_Course.getInstance().getStudents().get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row_view;

        if (convertView == null ){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row_view = inflater.inflate(R.layout.student_row, parent, false);
        }else row_view = convertView;

        Student stu = DatabaseStudent_Course.getInstance().getStudents().get(position);

        TextView firstview = (TextView) row_view.findViewById(R.id.first_name_id);
        TextView lastview = (TextView) row_view.findViewById(R.id.last_name_id);
        firstview.setText(stu.getFirstname());
        lastview.setText(stu.getLastname());
        row_view.setTag(new Integer(position));

        return row_view;
    }
}
