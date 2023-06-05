package com.mycompany.university;

/**
 *
 * @author Farida Fatali
 */
public class Department {
    String name;
    {
        name = "Software Engineering";
        System.out.println("The department name: " + name);
    }
    
    Professor head;
    Course[] courses;
    Student[] students;
    

    public Department() {
    }

    public Department(String name, Professor head, Course[] courses, Student[] students) {
        this(name, head, courses);
//        this.name = name;
//        this.head = head;
//        this.courses = courses;
        this.students = students;
    }
    
    public Department(String name, Professor head, Course[] courses){
        this.name = name;
        this.head = head;
        this.courses = courses;        
    }
    
}
