package org.example;

/**
 * Main application class for demonstrating university course registration.
 */
public class App {

    // Private constructor to prevent instantiation
    private App() {
        // Utility class, no instances allowed
    }

    /**
     * Main method to run the university course registration demonstration.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        runDemo(); // Reduce direct dependency in main method
    }

    /**
     * Method to run the university course registration demonstration.
     */
    private static void runDemo() {
        University myUniversity = new University();
        initializeData(myUniversity);

        System.out.println("Total courses offered: " + Course.getTotalCourses());
        myUniversity.printEnrollments();
    }

    /**
     * Initializes demo data for the university.
     *
     * @param university the university object to initialize
     */
    private static void initializeData(final University university) { //final
        Student stud1 = new Student("Jane Doe", "001");
        Student student2 = new Student("John Smith", "002");

        Course course1 = new Course("Software Engineering", 30);
        Course course2 = new Course("Data Structures", 40);

        university.addCourse(course1);
        university.addCourse(course2);

        university.registerStudentForCourse(stud1, course1);
        university.registerStudentForCourse(student2, course2);
    }
}
