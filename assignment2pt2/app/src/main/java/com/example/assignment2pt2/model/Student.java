package com.example.assignment2pt2.model;

import java.util.ArrayList;

public class Student {
    protected String mFirstname;
    protected String mLastname;
    protected String mCWID;
    protected ArrayList<CourseEnrollment> mCourses;

    public Student(String firstname, String lastname, String CWID)
    {
        mFirstname = firstname;
        mLastname = lastname;
        mCWID = CWID;
    }

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getCWID() {
        return mCWID;
    }

    public void setCWID(String CWID) {
        mCWID = CWID;
    }

    public ArrayList<CourseEnrollment> getCourses() {
        return mCourses;
    }

    public void setCourses(ArrayList<CourseEnrollment> courses) {
        mCourses = courses;
    }
}
