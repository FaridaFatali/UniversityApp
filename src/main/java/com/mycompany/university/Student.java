package com.mycompany.university;

/**
 *
 * @author Farida Fatali
 */
public class Student {
    String no;
    {
        no = new String("7654321");
        System.out.println("The student no: " + no);
    }
    
    String name;
    {
        name = new String("Akin Kaldiroglu");
        System.out.println("The student name: " + name);
    }
    
    String dateOfBirth;
    {
        dateOfBirth = new String("09.03.1995");
        System.out.println("The student date of birth: " + dateOfBirth);
    }
    
    Department department;
    Professor advisor;
    Course[] coursesTaken;
    

    
    public Student() {
    }

    public Student(String no, String name, String dateOfBirth, Department department, Professor advisor, Course[] coursesTaken) {
        this(no, name, department, advisor);
//        this.no = no;
//        this.name = name;
        this.dateOfBirth = dateOfBirth;
//        this.department = department;
//        this.advisor = advisor;
        this.coursesTaken = coursesTaken;
    }
    
    public Student(String no, String name, Department department, Professor advisor){
        this.no = no;
        this.name = name;
        this.department = department;
        this.advisor = advisor;
    }
    
}
