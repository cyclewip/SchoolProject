package com.company;

import People.Student;
import People.Teacher;
import com.company.Skolor.CampusHelsingborg;
import com.company.Skolor.LundUniversity;
import com.company.Skolor.MalmoHogskola;
import com.company.Skolor.School;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int maxAmountOfClasses = 3;
    private int maxAmountOfStudents = 30;
    private List<School> schoolList = new ArrayList<School>();

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public Manager() {
    }

    public Manager(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public void createSchools() {
        schoolList.add(new CampusHelsingborg());
        schoolList.add(new LundUniversity());
        schoolList.add(new MalmoHogskola());
    }

    public void addClassRooms() {
        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).setClassrooms(new ArrayList<Classroom>());
            schoolList.get(i).getClassrooms().add(new Classroom("1A"));
            schoolList.get(i).getClassrooms().add(new Classroom("1B"));
            schoolList.get(i).getClassrooms().add(new Classroom("1C"));
        }
    }

    public void addStudents() {
        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).getClassrooms().get(i).setStudentList(new ArrayList<Student>());
            ;
        }
        schoolList.get(0).getClassrooms().get(0).getStudentList().add(0, new Student("Martin Sandelin", 001));
        schoolList.get(0).getClassrooms().get(0).getStudentList().add(1, new Student("Henrik Olsson", 002));
        schoolList.get(0).getClassrooms().get(0).getStudentList().add(2, new Student("Emma Stark", 003));
        schoolList.get(0).getClassrooms().get(0).getStudentList().add(3, new Student("Josefine Svensson", 004));

        schoolList.get(1).getClassrooms().get(0).getStudentList().add(0, new Student("Josef Ali", 001));
        schoolList.get(1).getClassrooms().get(0).getStudentList().add(1, new Student("Leen Kadah", 002));
        schoolList.get(1).getClassrooms().get(0).getStudentList().add(2, new Student("Jakob Olofsson", 003));
        schoolList.get(1).getClassrooms().get(0).getStudentList().add(3, new Student("Emil Ljung", 004));

        schoolList.get(2).getClassrooms().get(0).getStudentList().add(0, new Student("Maria Svensson", 001));
        schoolList.get(2).getClassrooms().get(0).getStudentList().add(1, new Student("Jonathan Frisk", 002));
        schoolList.get(2).getClassrooms().get(0).getStudentList().add(2, new Student("Jonas Karlsson", 003));
        schoolList.get(2).getClassrooms().get(0).getStudentList().add(3, new Student("Sofie Albertsson", 004));
    }

    public void addTeachers() {
        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).setTeacherList(new ArrayList<Teacher>());
        }
        schoolList.get(0).getTeacherList().add(0, new Teacher("Håkan Malmberg", "Math"));
        schoolList.get(0).getTeacherList().add(1, new Teacher("Lotta Tuff", "English"));
        schoolList.get(0).getTeacherList().add(2, new Teacher("Lara Larsson", "Sports"));
        schoolList.get(0).getTeacherList().add(3, new Teacher("Erik Lavin", "History"));

        schoolList.get(1).getTeacherList().add(0, new Teacher("Finn Svensson", "Religion"));
        schoolList.get(1).getTeacherList().add(1, new Teacher("Junky Larsson", "English"));
        schoolList.get(1).getTeacherList().add(2, new Teacher("Björn Melin", "Alchemy"));
        schoolList.get(1).getTeacherList().add(3, new Teacher("Magnus Ling", "Physics"));

        schoolList.get(2).getTeacherList().add(0, new Teacher("Linus Mellblom", "Psychology"));
        schoolList.get(2).getTeacherList().add(1, new Teacher("Petra Bengtsson", "Spanish"));
        schoolList.get(2).getTeacherList().add(2, new Teacher("Tim Brandt", "Math"));
        schoolList.get(2).getTeacherList().add(3, new Teacher("Ulf Jonsson", "English"));
    }

    public void addCourses() {
        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).getClassrooms().get(0).setCourseList(new ArrayList<Course>());
        }
        schoolList.get(0).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(0).getTeacherList().get(0), 30, 001, "Math"));
        schoolList.get(0).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(0).getTeacherList().get(1), 15, 002, "English"));
        schoolList.get(0).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(0).getTeacherList().get(3), 7.5, 003, "History"));

        schoolList.get(1).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(1).getTeacherList().get(0), 15, 001, "Religion"));
        schoolList.get(1).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(1).getTeacherList().get(2), 30, 002, "Alchemy"));
        schoolList.get(1).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(1).getTeacherList().get(3), 30, 003, "Physics"));

        schoolList.get(2).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(2).getTeacherList().get(2), 30, 001, "Math"));
        schoolList.get(2).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(2).getTeacherList().get(3), 15, 002, "English"));
        schoolList.get(2).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(2).getTeacherList().get(0), 7.5, 003, "Psychology"));

    }
}
