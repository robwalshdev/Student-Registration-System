package com.course.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String studentName;
    private int age;
    private String dateOfBirth;
    private List<Course> courseList = new ArrayList<>();
    private List<Module> moduleList = new ArrayList();


    public Student(String studentName, int age, String dateOfBirth) {
        this.studentName = studentName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void addModule(Module module) {
        moduleList.add(module);
    }

    public List<Course> getCourse() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
        // Removes potential duplicates
        courseList.stream().distinct().collect(Collectors.toList());
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
