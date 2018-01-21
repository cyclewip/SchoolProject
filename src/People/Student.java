package People;

import com.company.Course;

public class Student {
    private int overallScore;
    private String name;
    private int id;

    Course course = new Course();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(int overallScore) {
        this.overallScore = overallScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
