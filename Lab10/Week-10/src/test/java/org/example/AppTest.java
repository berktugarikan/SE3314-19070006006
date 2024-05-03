package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the App class.
 */
public class AppTest
        extends TestCase
{
    /**
     * Creates the test case.
     *
     * @param testName the name of the test case
     */
    public AppTest(final String testName)
    {
        super(testName);
    }

    /**
     * Returns the suite of tests being tested.
     *
     * @return the suite of tests
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * A basic test to ensure the App is functioning.
     */
    public void testApp()
    {
        assertTrue(true);
    }
}
