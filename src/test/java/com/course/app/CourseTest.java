package com.course.app;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    private List<Student> testStudentList = new ArrayList<>();
    private List<Module> testModuleList = new ArrayList<>();
    private Course testCourse;
    private String testCourseName;

    @Before
    public void setup() {
        testCourseName = "Test Course";
        testStudentList.add(new Student("John", 20, "01/01/2000"));
        testModuleList.add(new Module("Test Module", testStudentList));
        testCourse = new Course("Test Course", testModuleList,new DateTime(), new DateTime());
    }

    @Test
    public void getCourseName() {
        assertEquals(testCourseName, testCourse.getCourseName());
    }

    @Test
    public void addModule() {
        testCourse.addModule(new Module("New Module"));
        assertEquals(2, testCourse.getModuleList().size());
    }

    @Test
    public void getStudents() {
        assertEquals(testStudentList, testCourse.getStudents());
    }
}
