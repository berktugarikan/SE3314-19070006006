package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents a university with multiple courses.
 * It allows adding courses and registering students for courses.
 */
public final class University {

    /**
     * A map that stores courses with their names as keys.
     */
    private final Map<String, Course> courses = new HashMap<>();

    /**
     * Constructs a new University.
     */
    public University() {
        // Default constructor
    }

    /**
     * Adds a course to the university if it's not already present.
     *
     * @param course the course to add
     */
    public void addCourse(final Course course) {
        if (course != null && !courses.containsKey(course.getCourseName())) {
            courses.put(course.getCourseName(), course);
        }
    }

    /**
     * Registers a student for a given course.
     *
     * @param student the student to register
     * @param course  the course to register the student for
     */
    public void registerStudentForCourse(final Student student, final Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Prints the list of courses and their enrolled students.
     */
    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }

    /**
     * Returns the map of courses in the university.
     *
     * @return the map of courses
     */
    public Map<String, Course> getCourses() {
        return new HashMap<>(courses);
    }
}
