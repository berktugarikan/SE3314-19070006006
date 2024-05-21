package org.example;

import java.util.ArrayList;

/**
 * Quest class and attributes like questName, leader, participants and map.
 */
public class Quest {
    private String questName; // Encapsulation: changed from public to private
    private Character leader; // Encapsulation: changed from public to private
    ArrayList<Character> participants; // Encapsulation: changed from public to private
    private MiddleEarthMap map; // Encapsulation: changed from public to private

    /**
     * Constructor for Quest.
     * @param questName the name of the quest
     * @param leader the leader of the quest
     * @param map the map for the quest
     * @throws IllegalArgumentException if questName is null or empty, or if leader or map is null
     */
    public Quest(String questName, Character leader, MiddleEarthMap map) {
        if (questName == null || questName.isEmpty()) { // Error Handling: added check for null or empty quest name
            throw new IllegalArgumentException("Quest name must not be null or empty");
        }
        if (leader == null) { // Error Handling: added check for null leader
            throw new IllegalArgumentException("Leader must not be null");
        }
        if (map == null) { // Error Handling: added check for null map
            throw new IllegalArgumentException("Map must not be null");
        }
        this.questName = questName; // Correct initialization of questName
        this.leader = leader; // Correct initialization of leader
        this.map = map; // Correct initialization of map
        this.participants = new ArrayList<>(); // Correct initialization of participants
    }

    /**
     * Adds Participant and checks is it null or not.
     * @param character
     */
    public void addParticipant(Character character) {
        if (character == null) { // Error Handling: added check for null participant
            throw new IllegalArgumentException("Participant must not be null");
        }
        participants.add(character); // Adding participant to the list
    }

    /**
     * Starts program.
     */
    public void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader);
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant); // Corrected to print participant details
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) { // Fixed to use the getter method for locations
            System.out.println(location);
        }
    }
}
