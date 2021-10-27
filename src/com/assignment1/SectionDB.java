package com.assignment1;

public class SectionDB {
    Section [] sectionList = new Section[2];

    public void setSection () {
        sectionList[0] = new Section();
        sectionList[0].name = "Section-01";
        sectionList[0].time = "Sunday: 12:30 pm 1:00 pm";

        sectionList[1] = new Section();
        sectionList[1].name = "Section-02";
        sectionList[1].time = "Sunday: 2:30 pm 4:00 pm";
    }

    public void print () {
        int n = 0;
        while (n < 2) {
            System.out.print(n+1 + "  " + sectionList[n].toString());
            n++;
        }
    }
}
