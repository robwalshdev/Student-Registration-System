package com.course.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Module {
    private String moduleName;
    private List<Student> studentList = new ArrayList<>();
    private List<Course> courseList = new ArrayList<>();

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
        // Removes potential duplicates
        courseList.stream().distinct().collect(Collectors.toList());
    }

    public Module(String moduleName, List<Student> studentList) {
        this.moduleName = moduleName;
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        student.addModule(this);
    }

    public String getModuleName() {
        return moduleName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Module Details:\n\t" +
                "Module name: " + moduleName  + "\n\t" +
                "Courses " + courseList + "\n\t" +
                "Students enrolled: " + studentList;
    }
}
