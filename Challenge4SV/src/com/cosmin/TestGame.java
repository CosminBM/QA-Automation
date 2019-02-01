package com.cosmin;

public class TestGame {

    public static void main(String[] args) {
        Alien predator = new Alien(100, 200);
        Human man = new Human(200, 100);

        while ((predator.getEnergy() > 0 && predator.getHealth() > 0) && (man.getAmmo() > 0 && man.getHealth() > 0)) {
            if ((predator.getEnergy() >= 10 && predator.getHealth() > 0) && (man.getAmmo() >= 15 && man.getHealth() > 0)) {

                predator.biteHuman(man);
                System.out.println("Alien bites man");
                System.out.println("Alien's energy:" + predator.getEnergy());
                System.out.println("Human's health: " + man.getHealth());
                System.out.println("-----------------------");
                if (predator.getEnergy() < 10) {
                    predator.setEnergy(predator.getEnergy());
                    System.out.println("Alien's energy:" + predator.getEnergy());
                    System.out.println("Energy is lower than 15, can't byte!");
                } else if (predator.getHealth() <= 0) {
                    predator.setDead(predator.isDead());
                    System.out.println("Alien's health: " + predator.getHealth());
                    System.out.println("Alien has died!");
                }

                man.shootAlien(predator);
                System.out.println("Human shoots Alien one time");
                System.out.println("Human's ammo:" + man.getAmmo());
                System.out.println("Alien's health: " + predator.getHealth());
                System.out.println("-----------------------");
                if (man.getAmmo() < 15) {
                    man.setAmmo(man.getAmmo());
                    System.out.println("Human's ammo:" + man.getAmmo());
                    System.out.println("Ammo is lower than 15, can't shoot!");
                } else if (man.getHealth() <= 0) {
                    man.setDead(man.isDead());
                    System.out.println("Human's health: " + man.getHealth());
                    System.out.println("Human has died!");
                } else {
                    man.shootAlien(predator);
                    System.out.println("Human shoots Alien one time");
                    System.out.println("Human's ammo:" + man.getAmmo());
                    System.out.println("Alien's health: " + predator.getHealth());
                    System.out.println("-----------------------");
                }
            }
        }
    }
}

