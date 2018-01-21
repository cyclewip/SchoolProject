package com.company;

import People.Student;
import People.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className = "";
    private int maxAmountOfStudent = 30;
    private int maxAmountOfCourses = 30;
    private List<Student> studentList = new ArrayList<Student>(maxAmountOfStudent);
    private List<Course> courseList = new ArrayList<Course>(maxAmountOfCourses);
    private int nrOfStudents;

    public Classroom(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getNrOfStudents() {
        return nrOfStudents;
    }

    public void setNrOfStudents(int nrOfStudents) {
        this.nrOfStudents = nrOfStudents;
    }
}
