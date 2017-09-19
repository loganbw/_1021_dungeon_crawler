package com.logan;

import java.util.Random;

public  class Hero {
    private String name;
    private int strength = 3;
    private int health = 50;
    private int stealth = 9;
    private int flee = 6;
    Random rng = new Random();
    int roll = rng.nextInt(10) + 1;
    private int damageDealt = roll;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getHealth() {
        return health;
    }

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;

    }

    public boolean fight(){
        int roll = rng.nextInt(10);
        if( strength <= roll){
            damageDealt = roll;
            //System.out.println("You dealt " + damageDealt + " damage!!" );
            return true;
        }else{

            return false;
        }
    }
    public boolean flee(){
        int roll = rng.nextInt(10);
        if (flee <= roll){
           // System.out.println("you flee");
            return true;
        } else {
          //  System.out.println("you are trapped");
            return false;
        }
    }
    public boolean advance(){
        int roll = rng.nextInt(10);
        if (stealth >= roll){
          //  System.out.println("you advance through the floor");
            return true;
        } else{
          //  System.out.println("the monster see's you");
            return false;
        }

    }
    public boolean death(){

        if (health <= 0){
           // System.out.println(" you made it to floor *num* try again?");
            return true;
        } else{
           // System.out.println("your health is at *hp*");
            return false;
        }
    }
}
