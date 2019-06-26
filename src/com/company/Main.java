package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String ans = "y";
        while(!ans.equals("n")) {
            System.out.println("Enter the student's id: ");
            int id = read.nextInt();
            read.nextLine();
            System.out.println("Enter the student's first and last name: ");
            String first = read.next();
            String last = read.next();
            students.add(new Student(id, first, last));
            read.nextLine();
            ans = "y";
            while (!ans.equals("n")) {
                if (ans.equals("y")) {
                    System.out.println("Enter the course: ");
                    String course = read.nextLine();
                    System.out.println("Enter the course credits: ");
                    int credits = read.nextInt();
                    read.nextLine();
                    System.out.println("Enter the grade earned: ");
                    String grade = read.nextLine();
                    Course c = new Course(course, credits, grade);
                    students.get(students.size() - 1).getCourses().add(c);
                }
                System.out.println("Enter in another course? Type y/n");
                ans = read.nextLine();
            }
            System.out.println("Enter in another student? Type y/n");
            ans = read.nextLine();
        }

        for (Student student : students) {
            int points = 0;
            int credits = 0;
            System.out.print(student.getFirst() + " " + student.getLast() + "\nStudent ID: " + student.getId() + "\n\n");
            System.out.println("Credits\t\tGrade\t\tPoints Earned\t\tCourse");
            System.out.println("_______\t\t_____\t\t_____________\t\t______");
            for (Course course : student.getCourses()) {
                System.out.println(course.getCredits() + "\t\t\t" + course.getGrade() + "\t\t\t" +
                        course.getPoints() + "\t\t\t\t\t" + course.getCourse());
                points += course.getPoints() * course.getCredits();
                credits += course.getCredits();
            }
            System.out.println("\nGPA: " + String.format("%.2f", (double) points / credits) + "\n");
        }
    }
}
