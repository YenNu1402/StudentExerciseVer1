package studentexercisever1;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;
    public StudentList(){
        studentList = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void deleteStudentById(String id){
        for(Student student : studentList){
            if(student.getId().equals(id)){
                studentList.remove(student);
                System.out.println("Delete successfully.");
                return;
            }
        }
        System.out.println("Can't find infomation!!!");
    }
    public Student findStudentById(String id){
        for(Student student : studentList){
            if(student.getId().equals(id)){
                studentList.add(student);
                return student;
            }
        }
        return null;
    }
    public void displayAllStudent(){
        for(Student student : studentList){
            student.displayInfo();
        }
    }
    public Student findTopStudent(){
        Student topStudent = null;
        for(Student student : studentList){
            if(topStudent == null || student.getGpa()>topStudent.getGpa()){
                topStudent = student;
            }
        }
        return topStudent;
    }
}