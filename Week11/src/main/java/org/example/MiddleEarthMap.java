package org.example;

/**
 * Represents a map of Middle Earth.
 */
public class MiddleEarthMap {
    /**
     * Empty constructor.
     */
    public MiddleEarthMap() {
    }

    /**
     * Navigates to the specified location in Middle Earth.
     *
     * @param location        The location to navigate to.
     * @param isSecretPassage Indicates whether to take a secret passage.
     */

    public void navigate(final String location, final boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                // FallThrough violation - Missing break
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            default:
                System.out.println("Unknown location");
                break;
        }
        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
