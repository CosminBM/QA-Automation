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

    public boolean validateAmmo(int ammo) {
        if (ammo < 1 || ammo > 200) {
            return false;
        } else {
            this.ammo = ammo;
        }
        return true;
    }

    public boolean validateHealth(int health) {
        if (health < 1 || health > 100) {
            return false;
        } else {
            this.health = health;
        }
        return true;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }

    public void shootAlien(Alien alien) {
        alien.setHealth(alien.getHealth() - 15);
        this.setAmmo(this.getAmmo() - 15);
    }
}