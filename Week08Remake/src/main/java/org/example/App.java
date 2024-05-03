package org.example;

/**
 * Main class for the application.
 */
public class App {
    // Private constructor to prevent instantiation
    private App() {
        // Utility class; no instantiation allowed
    }

    /**
     * The main entry point of the application.
     *
     * @param args command-line arguments (typically not used in this context)
     */
    public static void main(final String[] args) {
        Game game = new Game();
        game.addCharacter(new Warrior("Conan", 100, 15));
        game.addCharacter(new Mage("Merlin", 80, 20));
        game.addCharacter(new Archer("Legolas", 90, 18));

        game.startGame();
    }
}
