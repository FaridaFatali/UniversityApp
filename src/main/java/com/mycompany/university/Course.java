package com.mycompany.university;

import java.util.Date;

/**
 *
 * @author Farida Fatali
 */
public class Course {
    String code;
    {
        code = new String("25");
        System.out.println("The course code: " + code);
    }
    
    String name;
    {
        name = new String("Int. to Software Engineering");
        System.out.println("The course name: " + name);
    }
    
    Department department;
    Professor teacher;
    Student[] students;
    String[] days;
    Date time;
    
    
    public Course() {
    }

    public Course(String code, String name, Department department, Professor teacher, Student[] students, String[] days, Date time) {
        this(name, department, teacher);
        this.code = code;
//        this.name = name;
//        this.department = department;
//        this.teacher = teacher;
        this.students = students;
        this.days = days;
        this.time = time;
    }
    
    public Course(String name, Department department, Professor teacher){
        this.name = name;
        this.department = department;
        this.teacher = teacher;
    }
    
}
