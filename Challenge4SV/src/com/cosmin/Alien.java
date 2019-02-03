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
        validateEnergy(energy);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        validateHealth(health);
    }

    public int validateEnergy(int energy) {
        if (energy < 0 || energy > 100) {
            System.out.println("The alien's energy must be between 0 - 100");
            System.exit(0);
        } else {
            this.energy = energy;
        }
        return energy;
    }

    public int validateHealth(int health) {
        if (health < 0 || health > 200) {
            System.out.println("The alien's health must be between 0 - 200");
            System.exit(0);
        } else {
            this.health = health;
        }
        return health;
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