package com.assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);

        StudentDB sdb = new StudentDB();
        Faculty fac = new Faculty();
        SectionDB sectionDB = new SectionDB();

        Section [] section1 = new Section[9];
        int sec1Count = 9;
        Section [] section2 = new Section[9];
        int sec2Count = 9;

        sectionDB.setSection();

        while (true) {
            System.out.println("Enter 1 to Student Registration");
            System.out.println("Enter 2 to Student Login");
            System.out.println("Enter 3 to Faculty Login");

            int dashboardCheck = ps.nextInt();
            ps.nextLine();

            if (dashboardCheck == 1) {
                sdb.studentRegister();
                sdb.print();
            }
            else if (dashboardCheck == 2) {
                sdb.print();
                boolean loginVerification = sdb.studentLogin();
                if (loginVerification) {
                    System.out.println("Enter 1 to select Section 1");
                    System.out.println("Enter 2 to select Section 2");
                    System.out.println("1 Section-01    Sunday: 12:30 pm 1:00 pm    " + sec1Count + " seat(s) remaining");
                    System.out.println("2 Section-02    Sunday: 2:30 pm 4:00 pm    " + sec2Count + " seat(s) remaining");
                    int selectedSection = ps.nextInt();

                    if (selectedSection == 1) {

                    }
                }
            }
            else if (dashboardCheck == 3) {
                System.out.println("Enter faculty email: ");
                String facEmail = ps.nextLine();
                System.out.println("Enter password: \n");
                String facPass = ps.nextLine();

                if (fac.facultyEmail.equals(facEmail)) {
                    if (fac.password.equals(facPass)) {

                        System.out.println("Faculty login successful!\n");

                        System.out.println("Enter 1 to choose Section 1");
                        System.out.println("Enter 2 to choose Section 2");
                        int sectionCheck = ps.nextInt();

                    }
                }
            }
        }
    }
}
