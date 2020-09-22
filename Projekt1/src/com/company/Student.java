package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = " ";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor student to enter name and year, generate ID and enroll courses
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1- Freshmen\n2-Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
        //System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);

    }
    //set ID
    private void setStudentID() {
//Grade level + ID
        id++;
       this.studentID = gradeYear +""+id;
    }
    public void enroll() {
        do {
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner((System.in));
        String course = in.nextLine();
        if (!course.equalsIgnoreCase("Q")) {
            courses = courses + "\n" + course;
            tutionBalance = tutionBalance+costOfCourse;
        }
        else {

            break; }} while (1 !=0);
        //System.out.println("Enroled in: "+courses);
        //System.out.println("Tution balance: "+tutionBalance);
    }
    //view balance,
    public void viewBalance() {
        System.out.println("Your balance is: $"+tutionBalance);
    }
    //pay tution
    public void payTution() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }
    //show status
public String toString() {
        return  "Name: "+firstName+" "+lastName+
                "\nGrade Level: "+gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled: "+courses+
                "\nRemaining Balance is: $"+tutionBalance;
}

}
