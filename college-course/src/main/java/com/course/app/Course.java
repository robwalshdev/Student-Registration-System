package com.course.app;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> studentList = new ArrayList<>();
    private List<Module> moduleList = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(String courseName, List<Student> studentList, List<Module> moduleList, DateTime startDate,
          DateTime endDate) {
        this.courseName = courseName;
        this.studentList = studentList;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addModule(Module module) {
        moduleList.add(module);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
}
