package com.cosmin;

public class TestGame {

    public static void main(String[] args) {
        Alien predator = new Alien();
        Human man = new Human();

        if (predator.isDead()) {
            System.out.println("Alien's health: " + predator.getHealth());
            System.out.println("Alien has died!");
            return;
        } else if (man.isDead()) {
            System.out.println("Human's health: " + man.getHealth());
            System.out.println("Human has died!");
            return;
        } else if (!predator.validateEnergy(predator.getEnergy())) {
            System.out.println("Alien's energy: " + predator.getEnergy());
            System.out.println("The alien's energy must be between 1 - 100");
            return;
        } else if (!predator.validateHealth(predator.getHealth())) {
            System.out.println("Alien's health: " + predator.getHealth());
            System.out.println("The alien's health must be between 1 - 200");
            return;
        } else if (!man.validateAmmo(man.getAmmo())) {
            System.out.println("Human's ammo: " + man.getAmmo());
            System.out.println("The human's ammo must be between 1 - 200");
            return;
        } else if (!man.validateHealth(man.getHealth())) {
            System.out.println("Human's health: " + man.getHealth());
            System.out.println("The human's health must be between 1 - 100");
            return;
        }

        while (!predator.isDead() && !man.isDead()) {

            if (predator.getEnergy() < 10) {
                System.out.println("Alien's energy: " + predator.getEnergy());
                System.out.println("Energy is lower than 10, can't byte!");
                break;
            } else if (man.getHealth() > 0 && predator.getHealth() > 0) {
                System.out.println("Human's health: " + man.getHealth());
                System.out.println("Alien's energy: " + predator.getEnergy());
                predator.biteHuman(man);
                System.out.println("Alien bites man");
                System.out.println("Alien's energy: " + predator.getEnergy());
                System.out.println("Human's health: " + man.getHealth());
                System.out.println("-----------------------");
            }

            if (man.getAmmo() < 15) {
                System.out.println("Human's ammo: " + man.getAmmo());
                System.out.println("Ammo is lower than 15, can't shoot!");
                break;
            } else if (predator.getHealth() > 0 && man.getHealth() > 0) {
                System.out.println("Alien's health: " + predator.getHealth());
                System.out.println("Human's ammo: " + man.getAmmo());
                man.shootAlien(predator);
                System.out.println("Human shoots Alien first time");
                System.out.println("Human's ammo: " + man.getAmmo());
                System.out.println("Alien's health: " + predator.getHealth());
                System.out.println("-----------------------");
            }

            if (man.getAmmo() < 15) {
                System.out.println("Human's ammo:" + man.getAmmo());
                System.out.println("Ammo is lower than 15, can't shoot!");
                break;
            } else if (predator.getHealth() > 0 && man.getHealth() > 0) {
                System.out.println("Alien's health: " + predator.getHealth());
                System.out.println("Human's ammo: " + man.getAmmo());
                man.shootAlien(predator);
                System.out.println("Human shoots Alien second time");
                System.out.println("Human's ammo: " + man.getAmmo());
                System.out.println("Alien's health: " + predator.getHealth());
                System.out.println("-----------------------");
            }
        }
    }
}