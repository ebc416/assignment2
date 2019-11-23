package com.example.assignment2pt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment2pt2.adapter.SummaryAdapter;
import com.example.assignment2pt2.model.CourseEnrollment;
import com.example.assignment2pt2.model.DatabaseStudent_Course;
import com.example.assignment2pt2.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected ListView mSummaryView;
    protected SummaryAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createStuDB();
        setContentView(R.layout.studentsummary);
        mSummaryView = findViewById(R.id.student_summary_id);
        ad = new SummaryAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createStuDB(){
        ArrayList<Student> studentlist = new ArrayList<Student>();

        Student stu = new Student("Mike", "Cook", "000000000");
        ArrayList<CourseEnrollment> course = new ArrayList<CourseEnrollment>();
        course.add(new CourseEnrollment("0","A"));
        course.add(new CourseEnrollment("1","A"));
        stu.setCourses(course);
        studentlist.add(stu);

        stu = new Student("Alma", "Joy", "999999999");
        course = new ArrayList<CourseEnrollment>();
        course.add(new CourseEnrollment("0","B"));
        course.add(new CourseEnrollment("1","C"));
        stu.setCourses(course);
        studentlist.add(stu);

        DatabaseStudent_Course.getInstance().setStudents(studentlist);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.summary_screen_menu, menu);
        menu.findItem(R.id.act_add).setVisible(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, StuAdd.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ad.notifyDataSetChanged();
    }
}
