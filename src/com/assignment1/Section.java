package com.assignment1;

public class Section {
    public String name;
    public String time;
    public int remainingSeat = 9;

    public String toString() {
        return name + "     " + time + "     " + remainingSeat + " seat(s) remaining";
    }
}
