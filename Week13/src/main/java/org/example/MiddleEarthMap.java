package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Represents the map of Middle Earth.
 */
public class MiddleEarthMap {
    public List<String> locations; // Assuming public is intended for simplicity

    /**
     * Constructor for MiddleEarthMap.
     */
    public MiddleEarthMap() {
        locations = Arrays.asList("The Shire", "Rivendell", "Mordor"); // Map locations initialization
    }

    // Getter method for locations
    public List<String> getLocations() {
        return locations;
    }
}
