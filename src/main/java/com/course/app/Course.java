package com.course.app;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Course {
    private String courseName;
    private List<Module> moduleList = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(String courseName, List<Module> moduleList, DateTime startDate,
          DateTime endDate) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public void addModule(Module module) {
        moduleList.add(module);

        // Assign course to student
        for(Student student: module.getStudentList())
            student.addCourse(this);

        // Add course to list of courses for modules
        module.addCourse(this);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        // Get students enrolled:
        // Ensures no duplicate students are returned
        // which could occur due to students being
        // enrolled in multiple modules which are part
        // of one course.
        List<Student> listOfStudents = new ArrayList<>();
        for (Module module: moduleList) {
            listOfStudents.addAll(module.getStudentList());
        }

        return listOfStudents.stream().distinct().collect(Collectors.toList());
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

    @Override
    public String toString() {
        return "Course Details:\n" +
                "Course name: " + courseName + "\n" +
                "Start date: " + startDate + "\n" +
                "End date: " + endDate + "\n" +
                "Modules in course: " + moduleList + "\n" +
                "Students enrolled: " + getStudents();
    }
}
