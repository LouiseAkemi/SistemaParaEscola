package model;

public class Grades {
    private Students student;
    private float grade;

    public Grades(Students student, float grade) {
        this.student = student;
        this.grade = grade;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

}
