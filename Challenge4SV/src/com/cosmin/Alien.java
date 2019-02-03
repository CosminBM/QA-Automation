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
        if (energy < 0 || energy > 100) {
            throw new IllegalArgumentException("The alien's energy must be between 0 - 100");
        } else {
            this.energy = energy;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 200) {
            throw new IllegalArgumentException("The alien's health must be between 0 - 200");
        } else {
            this.health = health;
        }
    }

    @Override
    public boolean isDead() {
        return this.health > 0;
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