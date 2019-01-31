package com.cosmin;

public class Alien implements Character {
    private int energy;
    private int health;
    private boolean isDead = false;

    public Alien(int energy, int health) {
        this.energy = energy;
        this.health = health;
    }

    public int getEnergy(){
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

    public boolean isDead() {
        return this.health <= 0 ? true : isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void biteHuman(Human human){
        if(this.energy <= 100 && this.energy >= 80){
            human.setHealth(getHealth() - 20);
        } else if (this.energy <= 80 && this.energy >= 60){
            human.setHealth(getHealth() - 10);
        } else if (this.energy < 50){
            human.setHealth(getHealth() - 5);
        }
        this.setEnergy(getEnergy() - 10);
    }
}
