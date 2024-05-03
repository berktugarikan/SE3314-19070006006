package org.example;

/**
 * Represents an Archer character in the game.
 * Archers are skilled with bows and have a powerful special attack.
 */
public final class Archer extends Character {
    public Archer(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Executes a special attack on an opponent.
     *
     * @param opponent The character to attack. It must be a valid target.
     */
    @Override
    public void special_Attack(final Character opponent) {
        opponent.takeDamage(getAttackPower() + 20);
    }
}
