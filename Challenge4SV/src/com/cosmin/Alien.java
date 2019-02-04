package com.cosmin;

public class Alien implements Character {
    private int energy = 100;
    private int health = 200;

    public Alien() {
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean validateEnergy(int energy) {
        if (energy < 1 || energy > 100) {
            return false;
        }
        return true;
    }

    public boolean validateHealth(int health) {
        if (health < 1 || health > 200) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isDead() {
        return this.health  <= 0;
    }

    public void biteHuman(Human human) {
        if (this.energy <= 100 && this.energy >= 80) {
            human.setHealth(human.getHealth() - 20);
        } else if (this.energy <= 80 && this.energy >= 60) {
            human.setHealth(human.getHealth() - 10);
        } else if (this.energy < 60) {
            human.setHealth(human.getHealth() - 5);
        }
        this.setEnergy(getEnergy() - 10);
    }
}