package com.course.app;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private List<Student> studentList = new ArrayList<>();

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public Module(String moduleName, List<Student> studentList) {
        this.moduleName = moduleName;
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public String getModuleName() {
        return moduleName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
