package org.example;

import org.junit.Test;
import org.junit.Assert; // Avoid using '*', explicitly import required classes

/**
 * Test cases for the Course class.
 */
public class CourseTest {

    /**
     * Constructor.
     */
    public CourseTest() {
        // Default constructor for test class
    }

    /**
     * Tests the addition of a student to a course.
     */
    @Test
    public void testAddStudent() {
        Course course = new Course("Mathematics", 30);
        Student student = new Student("Alice Smith", "003");
        course.addStudent(student);
        Assert.assertTrue(course.getStudents().contains(student)); // Access students via getter
    }
}
