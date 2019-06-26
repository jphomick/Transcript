package com.company;

class Course {
    int credits;
    String course, grade;

    Course(String course, int credits, String grade) {
        this.course = course;
        this.credits = credits;
        grade = grade.toUpperCase();
        if (grade.length() == 1 && (grade.equals("A") || grade.equals("B") || grade.equals("C") ||
                grade.equals("D") || grade.equals("F"))) {
            this.grade = grade;
        } else {
            grade = "F";
        }
    }

    public int getCredits() {
        return credits;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    public int getPoints() {
        if (grade.equals("A")) {
            return 4;
        } else if (grade.equals("B")) {
            return 3;
        } else if (grade.equals("C")) {
            return 2;
        } else if (grade.equals("D")) {
            return 1;
        } else {
            return 0;
        }
    }
}
