package com.course.app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

    private Module testModule;
    private String testModuleName;
    private List<Student> testStudentList = new ArrayList<>();

    @Before
    public void setup() {
        testStudentList.add(new Student("John", 20, "01/01/2000"));
        testModule = new Module("Test Module", testStudentList);
        testModuleName = "Test Module";
    }

    @Test
    public void addStudent() {
        testModule.addStudent(new Student("Jane", 21, "01/01/1999"));
        assertEquals(2, testModule.getStudentList().size());
    }

    @Test
    public void getModuleName() {
        assertEquals(testModuleName, testModule.getModuleName());
    }

    @Test
    public void getStudentList() {
        assertEquals(testStudentList, testModule.getStudentList());
    }

}
