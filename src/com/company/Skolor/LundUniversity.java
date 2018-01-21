package com.company.Skolor;

import People.Teacher;
import com.company.Classroom;
import People.Principal;

import java.util.ArrayList;
import java.util.List;

public class LundUniversity implements School {
    private int nrOfStudents = 0;
    private int nrOfClasses = 0;
    private String name = "Lund University";
    private int maxAmountOfTeacher = 10;
    private List<Teacher> teacherList = new ArrayList<Teacher>(maxAmountOfTeacher);
    private List<Classroom> classrooms = new ArrayList<>();
    Principal principal = new Principal();
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public int getNrOfStudents() {
        return nrOfStudents;
    }

    public void setNrOfStudents(int nrOfStudents) {
        this.nrOfStudents = nrOfStudents;
    }

    public int getNrOfClasses() {
        return nrOfClasses;
    }

    public void setNrOfClasses(int nrOfClasses) {
        this.nrOfClasses = nrOfClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }
}
