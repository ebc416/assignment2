package com.example.assignment2pt2.model;

public class CourseEnrollment {
    protected String mCourseid;
    protected String mGrade;

    public CourseEnrollment(String courseid, String grade){
        mCourseid = courseid;
        mGrade = grade;
    }

    public String getCourseid() {
        return mCourseid;
    }

    public void setCourseid(String courseid) {
        mCourseid = courseid;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String grade) {
        mGrade = grade;
    }
}
