package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class QuestTest {

    @Test
    public void testQuestCreation() {
        Character frodo = new Character("Frodo Baggins", 50);
        MiddleEarthMap map = new MiddleEarthMap();
        Quest quest = new Quest("The One Ring", frodo, map);

        assertNotNull("Quest should be created", quest); // Test quest creation
    }

    @Test
    public void testAddParticipant() {
        Character frodo = new Character("Frodo Baggins", 50);
        Character aragorn = new Character("Aragorn", 87);
        MiddleEarthMap map = new MiddleEarthMap();
        Quest quest = new Quest("The One Ring", frodo, map);

        quest.addParticipant(aragorn);
        assertEquals("Participant list size should be 1", 1, quest.participants.size()); // Test participant addition
        assertEquals("Added participant should be Aragorn", aragorn, quest.participants.get(0)); // Test correct participant added
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeAge() {
        new Character("Gollum", -1); // Test for negative age
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyQuestName() {
        Character frodo = new Character("Frodo Baggins", 50);
        MiddleEarthMap map = new MiddleEarthMap();
        new Quest("", frodo, map); // Test for empty quest name
    }
}
