package com.company;

public class Patience {

    public static void patience(boolean a, boolean b, int percent) {
        percent = Random.Random();
        float percent1 = Random.RandomFloat();
        boolean result;


        if (a == false && b == false && percent < 94) {
            result=false;
            System.out.println("Two women, their patient to each one percent is " + percent + ", they could not patient each one");
        } else if (a == false && b == false && percent >= 94) {
            result=true;
            System.out.println("Two women, their patient to each one percent is " + percent + ", they could patient each one");
        } else if (a == true && b == false && percent < 30) {
            result=false;
            System.out.println("Man and woman, their patient to each one percent is " + percent + ", they could not patient each one");

        } else if (a == true && b == false && percent >= 30) {
            result=true;
            System.out.println("Man and woman, their patient to each one percent is " + percent + ", they could  patient each one");

        } else if (a == false && b == true && percent < 30) {
            result=false;
            System.out.println("Woman and man, their patient to each one percent is " + percent + ", they could not patient each one");

        } else if (a == false && b == true && percent >= 30) {
            result=true;
            System.out.println("Woman and man, their patient to each one percent is " + percent + ", they could  patient each one");

        } else if (a == true && b == true && percent1 <= 5.6) {
            result=true;
            System.out.println("Two male, their patient to each one percent is" + percent1 + " they could  patient each one");

        } else if (a == true && b == true && percent1 > 5.6) {
            result=false;
            System.out.println("Two male, their patient to each one percent is " + percent1 + " they could not patient each one");
        } else {
            System.out.println("Unknown result");
        }
    }
}
