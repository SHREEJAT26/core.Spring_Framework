package com.SetterAndConstructor.di;

public class Student {
    private String studentName;
    private final Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    public Student(String studentName, Integer id) {
        this.studentName = studentName;
        this.id = id;
    }
/*

    public void setId(Integer id) {
        this.id = id;
        System.out.println("Setter method got called "+" :setId");
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("Setter method got called "+" :setStudentName");
    }
*/

    public void displayStudentInfo()
    {
        System.out.println("Student name is : "+studentName+" and percentage is : "+id);
    }

}
