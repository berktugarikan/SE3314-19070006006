package org.example;

/**
 * Main class to demonstrate usage of characters, maps, and quests in Middle Earth.
 */
public class App {
    /**
     * Empty constructor. And it is private because of checkstyle.
     */
    private App() {
    }

    /**
     * Main method to run the application.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(final String[] args) {


        // Create a new character named Frodo
        final Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();

        // Create a map of Middle Earth and navigate to Mordor
        final MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor");

        // Start a new quest and complete it
        final Quest quest = new Quest();
        quest.completeQuest(100);
    }
}
