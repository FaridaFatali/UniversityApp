package com.mycompany.university;

/**
 *
 * @author Farida Fatali
 */
public class Classroom {
    String no;
    {
        no = new String("55");
        System.out.println("The classroom no: " + no);
    }
    
    Department department;
    Student[] student;
    Course[] courses;
    Professor professor;

    public Classroom() {
    }

    public Classroom(String no, Department department, Student[] student, Course[] courses, Professor professor) {
        this.no = no;
        this.department = department;
        this.student = student;
        this.courses = courses;
        this.professor = professor;
    }
    
}
