package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName The name of the test case.
     */
    public AppTest(final String testName) {
        super(testName);
    }

    /**
     * @return The suite of tests being tested.
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test. :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
