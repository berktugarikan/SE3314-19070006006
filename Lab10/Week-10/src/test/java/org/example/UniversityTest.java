package org.example;

import org.junit.Test;
import org.junit.Assert; // Avoid using '.*' in imports

/**
 * Unit tests for the University class.
 */
public class UniversityTest {

    /**
     * Default constructor for UniversityTest.
     */
    public UniversityTest() {
        // Default constructor
    }

    /**
     * Tests adding a course to the university.
     */
    @Test
    public void testAddCourse() {
        University university = new University();
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        Assert.assertEquals(1, university.getCourses().size()); // Use the getter method
    }

    /**
     * Tests registering a student for a course.
     */
    @Test
    public void testRegisterStudentForCourse() {
        University university = new University();
        Student student = new Student("John Doe", "002");
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        Assert.assertTrue(course.getStudents().contains(student)); // Use the getter method
    }
}
