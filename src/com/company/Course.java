package com.company;

import People.Teacher;

public class Course {
    private Teacher teacher = new Teacher();
//    private CourseMaterial courseMaterial = new CourseMaterial();

    private double period = 0;
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
