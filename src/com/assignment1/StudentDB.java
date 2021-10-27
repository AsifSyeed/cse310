package com.assignment1;

import java.util.Scanner;

public class StudentDB {
    Scanner ps = new Scanner(System.in);

    Student [] studentList = new Student[18];

    int count = 0;

    public void print () {
        int n = 0;
        while (n < count) {
            System.out.print(n+1 + "  " + studentList[n].toString());
            n++;
        }
    }

    public void studentRegister() {
        if (count < studentList.length) {
            studentList[count] = new Student();

            System.out.println("Enter your name: ");
            studentList[count].name = ps.nextLine();

            System.out.println("Enter your Student ID: ");
            studentList[count].sid = ps.nextLine();

            System.out.println("Enter your email: ");
            studentList[count].email = ps.nextLine();

            System.out.println("Enter your password: ");
            studentList[count].password = ps.nextLine();

            System.out.println("Registration Successful!\n");
            count++;
        }
        else {
            System.out.print("Student limit has been reached \n");
        }
    }

    public boolean studentLogin () {
        boolean loginVerified = false;

        System.out.println("Enter your email: ");
        String email = ps.nextLine();

        System.out.println("Enter your password: ");
        String pass = ps.nextLine();

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (studentList[i].email.equals(email)) {
                    if (studentList[i].password.equals(pass)) {
                        loginVerified = true;
                        break;
                    }
                    else {
                        System.out.println("Incorrect Password\n");
                    }
                }
            }
        }
        if (loginVerified) {
            System.out.println("Login Successful!\n");
        }
        else {
            System.out.println("Student not found. Please Register first!\n");
        }

        return loginVerified;
    }
}
