package com.logan;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        int startingFloor = 1;
        int endFloor = 11;
        Hero logan = new Hero();
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean monsterIsHere = false;
        String myInput;
        boolean fight = logan.fight();

       while (startingFloor != endFloor){
           int roll = rng.nextInt(100) + 1;
           System.out.println("Floor : " + startingFloor);
          if (roll >= 33) {

              //make a monster
              Monster monster = new Monster();
              monsterIsHere = true;

              boolean fightM = monster.attack();
              System.out.println("monsters there");
              while (!monster.death()) {
                  logan.advance();
                  if (logan.advance() == false) {
                      System.out.println("The monster does not see you yet! would you like to advance past him?");
                      myInput = scanner.next();
                      if (myInput.compareToIgnoreCase("advance") == 0){
                      break;
                  }
              }
               else {
                  myInput = scanner.next();
                      if (myInput.compareToIgnoreCase("fight") == 0) {
                          logan.fight();
                          if (logan.fight() == true) {
                              monster.setHealth(monster.getHealth() - logan.getDamageDealt());
                              int monsterHealth = monster.getHealth();
                              //System.out.println("you dealt " + logan.getDamageDealt() + " damage!" );
                              System.out.println("you dealt " + logan.getDamageDealt() + " damage! " + "Monsters health " + monsterHealth);
                          } else {
                              System.out.println("missed");
                          }


                      }
                      //System.out.println(fight);
                      if (myInput.compareToIgnoreCase( "flee")==0) {
                          logan.flee();
                          if (logan.flee() == false) {
                              System.out.println("you are stuck!");

                          } else {
                              break;
                          }

                      }
                      monster.attack();
                      if (fightM == true) {
                          logan.setHealth(logan.getHealth() - monster.getDamageDealt());
                          int loganHealth = logan.getHealth();
                          System.out.println(" you took " + monster.getDamageDealt() + " damage and it droped your health down to " + loganHealth);
                      } else {
                          System.out.println("the monster missed!");
                      }


                      //hero die
                      //hero survies

                  }

              }

                  }
           System.out.println("you advanced! your health points are at " + logan.getHealth() );
           startingFloor++;
       }

       }

    }

