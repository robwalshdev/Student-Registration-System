package com.course.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student testStudent;
    private String testStudentId;

    @Before
    public void setup() {
        testStudent = new Student("Robert", 21, "9/3/99");
        testStudentId = "Robert21";
    }

    @Test
    public void getStudentName() {
        assertEquals( "Robert", testStudent.getStudentName());
    }

    @Test
    public void getStudentAge() {
        assertEquals( 21, testStudent.getAge());
    }

    @Test
    public void getStudentDateOfBirth() {
        assertEquals( "9/3/99", testStudent.getDateOfBirth());
    }

    @Test
    public void getStudentUsername() {
        assertEquals(testStudentId, testStudent.getUsername());
    }
}
