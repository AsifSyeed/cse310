package com.assignment1;

public class SectionDB {

    Section [] sectionList1 = new Section[9];
    Section [] sectionList2 = new Section[9];

    int sec1Count = 0;
    int sec2Count = 0;


    public void addToSection (int x, String stdName, String stdID) {
        if (x == 1) {
            if (sec1Count < sectionList1.length) {
                sectionList1[sec1Count] = new Section();
                sectionList1[sec1Count].name = stdName;
                sectionList1[sec1Count].id = stdID;
                sec1Count++;
            }
            else {
                System.out.println("This section is full. Please try a different one!");
            }
        }
        else if (x == 2) {
            if (sec2Count < sectionList2.length) {
                sectionList2[sec2Count] = new Section();
                sectionList2[sec2Count].name = stdName;
                sectionList2[sec2Count].id = stdID;
                sec2Count++;
            }
            else {
                System.out.println("This section is full. Please try a different one!");
            }
        }
    }

    public void print (int i) {
        if (i == 1) {
            int n = 0;
            System.out.println("Section 1");
            while (n < sectionList2.length) {
                if (sectionList1[n] != null) {
                    System.out.print(n+1 + "  " + sectionList1[n].toString());
                    n++;
                }
            }
        }
        else if (i == 2) {
            int n = 0;
            System.out.println("Section 2");
            System.out.println("Name        ID");
            while (n < sectionList2.length) {
                if (sectionList2[n] != null) {
                    System.out.print(n+1 + "  " + sectionList2[n].toString());
                    n++;
                }
            }
        }
        else {
            System.out.println("This section doesn't exist.\n");
        }
    }
}
