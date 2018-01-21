package com.company;

import People.Student;
import People.Teacher;
import com.company.Skolor.CampusHelsingborg;
import com.company.Skolor.LundUniversity;
import com.company.Skolor.MalmoHogskola;
import com.company.Skolor.School;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<String> studentsList = new ArrayList<String>();
    List<String> teachersList = new ArrayList<String>();
    int helsingborg = 0;
    int lund = 1;
    int malmo = 2;
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
        try {
            studentsList = Files.readAllLines(Paths.get("src/students.txt"), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).getClassrooms().get(i).setStudentList(new ArrayList<Student>());

        }
        schoolList.get(helsingborg).getClassrooms().get(0).getStudentList().add(0, new Student(studentsList.get(0), 001));
        schoolList.get(helsingborg).getClassrooms().get(0).getStudentList().add(1, new Student(studentsList.get(1), 002));
        schoolList.get(helsingborg).getClassrooms().get(0).getStudentList().add(2, new Student(studentsList.get(2), 003));
        schoolList.get(helsingborg).getClassrooms().get(0).getStudentList().add(3, new Student(studentsList.get(3), 004));

        schoolList.get(lund).getClassrooms().get(0).getStudentList().add(0, new Student(studentsList.get(4), 001));
        schoolList.get(lund).getClassrooms().get(0).getStudentList().add(1, new Student(studentsList.get(5), 002));
        schoolList.get(lund).getClassrooms().get(0).getStudentList().add(2, new Student(studentsList.get(6), 003));
        schoolList.get(lund).getClassrooms().get(0).getStudentList().add(3, new Student(studentsList.get(7), 004));

        schoolList.get(malmo).getClassrooms().get(0).getStudentList().add(0, new Student(studentsList.get(8), 001));
        schoolList.get(malmo).getClassrooms().get(0).getStudentList().add(1, new Student(studentsList.get(9), 002));
        schoolList.get(malmo).getClassrooms().get(0).getStudentList().add(2, new Student(studentsList.get(10), 003));
        schoolList.get(malmo).getClassrooms().get(0).getStudentList().add(3, new Student(studentsList.get(11), 004));
    }

    public void addTeachers() {
        try {
            teachersList = Files.readAllLines(Paths.get("src/teachers.txt"), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).setTeacherList(new ArrayList<Teacher>());
        }
        schoolList.get(helsingborg).getTeacherList().add(0, new Teacher(teachersList.get(0), "Math"));
        schoolList.get(helsingborg).getTeacherList().add(1, new Teacher(teachersList.get(1), "English"));
        schoolList.get(helsingborg).getTeacherList().add(2, new Teacher(teachersList.get(2), "Sports"));
        schoolList.get(helsingborg).getTeacherList().add(3, new Teacher(teachersList.get(3), "History"));

        schoolList.get(lund).getTeacherList().add(0, new Teacher(teachersList.get(4), "Religion"));
        schoolList.get(lund).getTeacherList().add(1, new Teacher(teachersList.get(5), "English"));
        schoolList.get(lund).getTeacherList().add(2, new Teacher(teachersList.get(6), "Alchemy"));
        schoolList.get(lund).getTeacherList().add(3, new Teacher(teachersList.get(7), "Physics"));

        schoolList.get(malmo).getTeacherList().add(0, new Teacher(teachersList.get(8), "Psychology"));
        schoolList.get(malmo).getTeacherList().add(1, new Teacher(teachersList.get(9), "Spanish"));
        schoolList.get(malmo).getTeacherList().add(2, new Teacher(teachersList.get(10), "Math"));
        schoolList.get(malmo).getTeacherList().add(3, new Teacher(teachersList.get(11), "English"));
    }

    public void addCourses() {
        for (int i = 0; i < schoolList.size(); i++) {
            schoolList.get(i).getClassrooms().get(0).setCourseList(new ArrayList<Course>());
        }
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(0).getTeacherList().get(0), 30, 001, "Math"));
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(0).getTeacherList().get(1), 15, 002, "English"));
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(0).getTeacherList().get(3), 7.5, 003, "History"));

        schoolList.get(lund).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(1).getTeacherList().get(0), 15, 001, "Religion"));
        schoolList.get(lund).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(1).getTeacherList().get(2), 30, 002, "Alchemy"));
        schoolList.get(lund).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(1).getTeacherList().get(3), 30, 003, "Physics"));

        schoolList.get(malmo).getClassrooms().get(0).getCourseList().add(0, new Course(schoolList.get(2).getTeacherList().get(2), 30, 001, "Math"));
        schoolList.get(malmo).getClassrooms().get(0).getCourseList().add(1, new Course(schoolList.get(2).getTeacherList().get(3), 15, 002, "English"));
        schoolList.get(malmo).getClassrooms().get(0).getCourseList().add(2, new Course(schoolList.get(2).getTeacherList().get(0), 7.5, 003, "Psychology"));
    }

    public void addCourseMaterial() {
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().get(0).setCourseMaterial(new CourseMaterial("Math book 1", 600));
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().get(1).setCourseMaterial(new CourseMaterial("English book 1", 500));
        schoolList.get(helsingborg).getClassrooms().get(0).getCourseList().get(2).setCourseMaterial(new CourseMaterial("History book 1", 700));

        schoolList.get(lund).getClassrooms().get(0).getCourseList().get(0).setCourseMaterial(new CourseMaterial("Religion book 2", 1100));
        schoolList.get(lund).getClassrooms().get(0).getCourseList().get(1).setCourseMaterial(new CourseMaterial("Alchemy book 2", 500));
        schoolList.get(lund).getClassrooms().get(0).getCourseList().get(2).setCourseMaterial(new CourseMaterial("Physics book 2", 500));

        schoolList.get(malmo).getClassrooms().get(0).getCourseList().get(0).setCourseMaterial(new CourseMaterial("Math book 3", 300));
        schoolList.get(malmo).getClassrooms().get(0).getCourseList().get(1).setCourseMaterial(new CourseMaterial("English book 3", 700));
        schoolList.get(malmo).getClassrooms().get(0).getCourseList().get(2).setCourseMaterial(new CourseMaterial("Psychology book 3", 1300));
    }
}
