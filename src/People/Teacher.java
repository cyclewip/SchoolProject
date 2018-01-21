package People;

public class Teacher {
    String name = "";
    String speciality = "";

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
