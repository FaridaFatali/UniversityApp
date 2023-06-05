package com.mycompany.university;

/**
 *
 * @author Farida Fatali
 */
public class Professor {
    String no;
    {
        no = new String("1234567");
        System.out.println("The professor no: " + no);
    }
    
    String name;
    {
        name =  new String("Ahmet Arslan");
        System.out.println("The professor name: " + name);
    }
    
    String dateOfBirth;
    {
        dateOfBirth = new String("03.06.1955");
        System.out.println("The professor date of birth: " + dateOfBirth);
    }
    
    String rank;
    {
        rank = new String("*****");
        System.out.println("The professor rank: " + rank);
    }
    
    Department department;
    Student[] advisee;
    Course[] coursesGiven;
    

    public Professor() {
    }

    public Professor(String no, String name, String dateOfBirth, String rank, Department department, Student[] advisee, Course[] coursesGiven) {
        this(no, name, department, coursesGiven);
//        this.no = no;
//        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.rank = rank;
//        this.department = department;
        this.advisee = advisee;
//        this.coursesGiven = coursesGiven;
    }
    
    public Professor(String no, String name, Department department, Course[] coursesGiven){
        this.no = no;
        this.name = name;
        this.department = department;
        this.coursesGiven = coursesGiven;
    }
}
