package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager = new Manager();
        manager.createSchools();
        manager.addClassRooms();
        manager.addStudents();
        manager.addTeachers();
        manager.addCourses();
        manager.addCourseMaterial();
    }
}
