package org.example;

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }

    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void special_Attack(Character opponent);

    public boolean isDefeated() {
        if(health <= 0) return true;
        return false;
    }

    public void complexMethodExample() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
