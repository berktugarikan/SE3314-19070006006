package org.example;

/**
 * Represents a quest in Middle Earth.
 */
public class Quest {
    /**
     * Empty constructor.
     */
    public Quest() {
    }

    /**
     * Completes a quest based on given points and ring bearer status.
     *
     * @param points        The points earned during the quest.
     * @param isRingBearer  Indicates whether the character is a ring bearer.
     * @return              True if the quest is successfully completed, otherwise false.
     */
    public boolean completeQuest(final int points, final boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return (points >= 100) ? true : false;
    }
}
