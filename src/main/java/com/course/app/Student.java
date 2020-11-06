package com.course.app;

public class Student {
    private String studentName;
    private int age;
    private String dateOfBirth;


    public Student(String studentName, int age, String dateOfBirth) {
        this.studentName = studentName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return this.studentName + this.age;
    }

    @Override
    public String toString() {
        return "Student Details:\n\t" +
                "Name: " + studentName + "\n\t"  +
                "Age: " + age + "\n\t"  +
                "DOB: " + dateOfBirth;
    }
}
