package studentexercisever1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addStudent(String id, String fullName, Date dateOfBirth, float gpa, String major){
        this.setId(id);
        this.setFullName(fullName);
        this.setDateOfBirth(dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }
    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId()
        + "Full Name: " + getFullName()
        + "Date Of Birth: " + sdf.format(getDateOfBirth())
        + "GPA: " + getGpa()
        + "Major: " + getMajor());
    }
    
}
