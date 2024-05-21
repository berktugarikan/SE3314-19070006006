package org.example;

/**
 * Chracter's name and age information.
 */
public class Character {
    private String name; // Encapsulation: changed from public to private
    private int age; // Encapsulation: changed from public to private

    /**
     * Constructor for Character.
     * @param name the name of the character
     * @param age the age of the character, must be non-negative
     * @throws IllegalArgumentException if age is negative
     */
    public Character(String name, int age) {
        if (age < 0) { // Error Handling: added check for negative age
            throw new IllegalArgumentException("Age must be non-negative");
        }
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", age: " + age; // Fixed toString method to correctly format the output
    }
}
