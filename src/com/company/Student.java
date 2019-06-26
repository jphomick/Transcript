package com.company;

import java.util.ArrayList;

public class Student {
    int id;
    String first, last;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    }

    public int getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
