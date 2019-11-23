package com.example.assignment2pt2.model;

import java.util.ArrayList;

public class DatabaseStudent_Course {
    private static final DatabaseStudent_Course ourinstace = new DatabaseStudent_Course();

    protected ArrayList<Student> mStudents;

    static public DatabaseStudent_Course getInstance()
    {
        return ourinstace;
    }

    private DatabaseStudent_Course(){
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        mStudents = students;
    }

    public void addStudent(Student student){
        mStudents.add(student);
    }
}
