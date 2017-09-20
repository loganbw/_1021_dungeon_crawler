package com.logan;

import java.util.Random;

public class Monster {
    private String monsterType;
    private int strength = 4;
    private int health = 25;
    Random rng = new Random();
    int rollD = rng.nextInt(5) + 1;
    private int damageDealt = rollD;

    public int getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public boolean attack(){
        int roll = rng.nextInt(10);
        if (strength <= roll){
           // System.out.println("the monster hit you!");
            return true;
        }else {
           // System.out.println("the monster missed!");
            return false;
        }

    }
    public boolean death(){

        if (health <= 0){
          //  System.out.println("the beast is slain!");
            return true;
        } else {
          //  System.out.println("Kill the beast! *hp status*");
            return false;
        }

    }
}
