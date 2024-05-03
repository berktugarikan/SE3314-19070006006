package org.example;

import org.junit.Test;
import org.junit.Assert; // Explicit import, avoid using '*'

/**
 * Unit tests for the Student class.
 */
public class StudentTest {

    /**
     * Default constructor for StudentTest.
     */
    public StudentTest() {
        // Default constructor
    }

    /**
     * Tests the getName method of the Student class.
     */
    @Test
    public void testGetName() {
        Student student = new Student("Bob Johnson", "004");
        Assert.assertEquals("Bob Johnson", student.getName());
    }
}
