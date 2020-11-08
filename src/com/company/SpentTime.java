package com.company;

public class SpentTime {

    public static void spentTime(float a, float b, int percent) {
        percent = Random.Random();
        boolean result;
        if (((((a-b)/b)*100)>10  || ((((b-a)/a)*100)>10)) && percent>14) {
            result=true;
            System.out.println("This people has big difference in heigh, they interest to spend time together percent is " + percent + ", they could spend time together");
        }
        else if (((((a-b)/b)*100)>10  || (((b-a)/a)*100)>10) && percent<=14) {
            result=false;
            System.out.println("This people has big difference in heigh, they interest to spend time together percent is " + percent + ", they could not spend time together");
        }
        else if (((((a-b)/b)*100)<10  || (((b-a)/a)*100)<10) && percent>4) {
            result=true;
            System.out.println("This people has no big difference in heigh, they interest to spend time together percent is " + percent + ", they could spend time together");
        }
        else if (((((a-b)/b)*100)<10  || (((b-a)/a)*100)<10) && percent<=4) {
            result=true;
            System.out.println("This people has no big difference in heigh, they interest to spend time together percent is " + percent + ", they could not spend time together");
        }

    }
}
