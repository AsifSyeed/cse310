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

    public boolean studentLogin (String email, String password) {
        boolean loginVerified = false;

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (studentList[i].email.equals(email) && studentList[i].password.equals(password)) {
                    loginVerified = true;
                    break;
                }
            }
        }
        if (loginVerified) {
            System.out.println("Login Successful!\n");
        } else {
            System.out.println("Invalid student information!\n");
        }
        return loginVerified;
    }

    public String getName (String email) {
        String stdName = null;

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (studentList[i].email.equals(email)) {
                    stdName = studentList[i].name;
                }
            }
        }

        return  stdName;
    }

    public String getID (String email) {
        String stdID = null;

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (studentList[i].email.equals(email)) {
                    stdID = studentList[i].sid;
                }
            }
        }

        return  stdID;
    }
}
