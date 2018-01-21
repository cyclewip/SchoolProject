package com.company.Skolor;

import com.company.Classroom;
import People.Principal;

import java.util.ArrayList;
import java.util.List;

public interface School {

    int nrOfStudents = 0;
    int nrOfClasses = 0;
    String name = "";
    List<Classroom> CLASSROOMS = new ArrayList<>();
    Principal principal = new Principal();

    public int getNrOfStudents();
    public void setNrOfStudents(int nrOfStudents);
    public int getNrOfClasses();
    public void setNrOfClasses(int nrOfClasses);
    public String getName();
    public void setName(String name);
    public List<Classroom> getClassrooms();
    public void setClassrooms(List<Classroom> classrooms);

}
