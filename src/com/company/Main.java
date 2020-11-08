package com.company;

public class Main extends Human {


    public static void main(int percent) {
        System.out.println("Type info about 1st person");
        Human human1 = new Human();
        System.out.println("Type info about 2nd person");
        Human human2 = new Human();

        //Talk---
        Speak.Speak(human1.sexIsMale, human2.sexIsMale, percent);

        //Patient---

        Patience.patience(human1.sexIsMale, human2.sexIsMale, percent);

        //Spent time---
        SpentTime.spentTime(human1.height, human2.height, percent);


        }

    }




