package com.cosmin;

public class Human implements Character {
    private int ammo = 200;
    private int health = 100;

    public Human() {
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        validateAmmo(ammo);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        validateHealth(health);
    }

    public int validateAmmo(int ammo) {
        if (ammo < 0 || ammo > 200) {
            System.out.println("The human's ammo must be between 0 - 200");
            System.exit(0);
        } else {
            this.ammo = ammo;
        }
        return ammo;
    }

    public int validateHealth(int health) {
        if (health < 0 || health > 100) {
            System.out.println("The human's health must be between 0 - 100");
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

    public void shootAlien(Alien alien) {
        alien.setHealth(alien.getHealth() - 15);
        this.setAmmo(this.getAmmo() - 15);
    }
}