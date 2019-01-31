package com.cosmin;

public class TestGame {

    public static void main(String[] args) {
        Alien predator =  new Alien(100, 200);
        Human men = new Human(200,100);
        predator.biteHuman(men);
        System.out.println(men.getHealth());
    }
}
