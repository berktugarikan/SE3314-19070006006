package org.example;

/**
 * This class represents a student with a name and an ID.
 */
public final class Student {

    /**
     * The name of the student.
     */
    private String studentName;

    /**
     * The ID of the student.
     */
    private String studentID;

    /**
     * Constructs a Student with a given name and ID.
     *
     * @param name the name of the student
     * @param id   the ID of the student
     */
    public Student(final String name, final String id) {
        this.studentName = name;
        this.studentID = id;
    }

    /**
     * Gets the name of the student.
     *
     * @return the student's name
     */
    public String getName() {
        return studentName;
    }

    /**
     * Gets the ID of the student.
     *
     * @return the student's ID
     */
    public String getStudentID() {
        return studentID;
    }
}
