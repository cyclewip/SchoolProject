package com.company.Skolor;

import People.Teacher;
import com.company.Classroom;
import People.Principal;

import java.util.ArrayList;
import java.util.List;

public interface School {

    int nrOfStudents = 0;
    int nrOfClasses = 0;
    String name = "";
    List<Classroom> classRooms = new ArrayList<>();
    Principal principal = new Principal();
    int maxAmountOfTeacher = 10;
    List<Teacher> teacherList = new ArrayList<Teacher>(maxAmountOfTeacher);
    public List<Teacher> getTeacherList();
    public void setTeacherList(List<Teacher> teacherList);
    public int getNrOfStudents();

    public void setNrOfStudents(int nrOfStudents);

    public int getNrOfClasses();

    public void setNrOfClasses(int nrOfClasses);

    public String getName();

    public void setName(String name);

    public List<Classroom> getClassrooms();

    public void setClassrooms(List<Classroom> classrooms);

}
