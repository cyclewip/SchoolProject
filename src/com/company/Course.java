package com.company;

import People.Teacher;

public class Course {
    private Teacher teacher = new Teacher();
    private CourseMaterial courseMaterial = new CourseMaterial();

    private double period = 0;

    public CourseMaterial getCourseMaterial() {
        return courseMaterial;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseMaterial(CourseMaterial courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    private String name = "";
    private int grade = 0;
    private int id = 001;

    public Course() {
    }

    public Course(Teacher teacher, double period, int id, String name) {
        this.teacher = teacher;
        this.period = period;
        this.id = id;
        this.name = name;
    }
}
