package com.company;

import java.util.Scanner;

public class StudentDatabaseApp {



    public static void main(String[] args) {


        //we will ask how many students we want to add
        System.out.println("Enter number of new students to enroll: ");

        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll(); //calling the method from Student.java
            students[n].payTution();
        
        }
        for (int n = 0; n < numOfStudents; n++) {

            System.out.println(students[n].toString());
        }

    }
}
