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
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
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
