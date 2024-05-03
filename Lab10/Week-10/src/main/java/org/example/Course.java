package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a course in a school or university.
 * It has a course name, a capacity, and a list of students.
 */
public class Course {

    /**
     * Total number of courses created.
     */
    private static int totalCourses = 0; //total_Courses -> totalCourses

    /**
     * The name of the course.
     */
    private String courseName; //CourseName -> courseName

    /**
     * The maximum capacity of the course.
     */
    private final int capacity; //Capacity -> capacity

    /**
     * List of students enrolled in the course.
     */
    private List<Student> students = new ArrayList<>();

    /**
     * Constructs a Course with a given name and capacity.
     *
     * @param name     the name of the course
     * @param capacity the maximum number of students the course can hold
     */
    public Course(final String name, final int capacity) {
        this.courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is room.
     *
     * @param student the student to add
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity) {
            students.add(student);
        }
    }

    /**
     * Returns the name of the course.
     *
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Returns the total number of courses created.
     *
     * @return the total number of courses
     */
    public static int getTotalCourses() {
        return totalCourses;
    }

    /**
     * Returns the list of students enrolled in the course.
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
