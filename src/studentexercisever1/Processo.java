package studentexercisever1;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Processo {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        boolean run = true;
        while (run){
            System.out.println("1.Add a new student"
            + "\n2.Update a student by id."
            + "\n3.Delete a student by id."
            + "\n4.Display all students."
            + "\n5.Find the student with the highest GPA."
            + "\n6.Exit.");
            System.out.println("Choose your option: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("-----Add a new student-----");
                    try{
                    sc.nextLine();
                    System.out.print("Enter ID:");
                    String id = sc.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter Date Of Birth(dd/MM/yyyy): ");
                    String dob = sc.nextLine();
                    Date dateOfBirth = sdf.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter major: ");
                    String major = sc.nextLine();
                    Student newStudent = new Student(gpa, major, id, fullName, dateOfBirth);
                    studentList.addStudent(newStudent);
                        System.out.println("Student add successfully");
                } catch (Exception e){
                    System.out.println("Invalid Input.");
                }
                    System.out.println("----------");
                    break;
                case 2:
                    System.out.println("-----Update a student by id-----");
                    System.out.println("Enter ID To Update: ");
                    String idUpdate = sc.nextLine();
                    Student studentToUpdate = studentList.findStudentById(idUpdate);
                    if(studentToUpdate != null){
                        try{
                            System.out.println("Enter New Name: ");
                            String newName = sc.nextLine();
                            studentToUpdate.setFullName(newName);
                            System.out.println("Enter New Date Of Birth: ");
                            String newDate = sc.nextLine();
                            Date newDateOfBirth = sdf.parse(newDate);
                            studentToUpdate.setDateOfBirth(newDateOfBirth);
                            System.out.println("Enter New GPA: ");
                            float newGpa = sc.nextFloat();
                            studentToUpdate.setGpa(newGpa);
                            System.out.println("Enter New Major: ");
                            String newMajor = sc.nextLine();
                            studentToUpdate.setMajor(newMajor);
                        } catch(Exception e){
                            System.out.println("Invalid Input!!!");
                        }
                        System.out.println("Update student successfully.");
                        System.out.println("----------");
                    } else {
                        System.out.println("Can't find information student.");
                        System.out.println("----------");
                    }
                    break;
                case 3:
                    System.out.println("-----Delete a student by id-----");
                    System.out.println("Enter ID To Delete: ");
                    String idDelete = sc.nextLine();
                    studentList.deleteStudentById(idDelete);
                    System.out.println("Delete Successflluy");
                    System.out.println("----------");
                    break;
                case 4:
                    System.out.println("-----Display all students-----");
                    studentList.displayAllStudent();
                    System.out.println("----------");
                    break;
                case 5:
                    System.out.println("-----Find the student with the highest GPA-----");
                    Student topStudent = studentList.findTopStudent();
                    if(topStudent != null){
                        System.out.println("Student with highest GPA: ");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("None student in list.");
                    }
                    System.out.println("----------");
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    System.out.println("----------");
                    break;
            }
                    
        }
        sc.close();
    }
}
