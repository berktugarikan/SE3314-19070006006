package org.example;

/**
 * The main class of the application.
 * The usage of the quest system.
 */
public class App {
    public static void main(String[] args) {
        try {
            Character frodo = new Character("Frodo Baggins", 50); // Fixed invalid age from -50 to 50
            Character aragorn = new Character("Aragorn", 87);
            MiddleEarthMap map = new MiddleEarthMap();
            Quest quest = new Quest("The One Ring", frodo, map); // Fixed empty quest name to "The One Ring"

            quest.addParticipant(aragorn);
            quest.start();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage()); // Error handling for invalid inputs
        }
    }
}
