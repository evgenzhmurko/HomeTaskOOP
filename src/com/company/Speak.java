package com.company;

public  class Speak {


    public static void Speak(boolean a, boolean b, int percent) {
        percent = Random.Random();
        boolean result;

        if (a==false && b==false){
            result=true;
            System.out.println("Two women always talks");
        }
        else if (a==true && b==false){
            result=true;
            System.out.println("Man and woman, they talks");

        }
        else if (a==false && b==true){
            result=true;
            System.out.println("Woman and man, they talks");

        }
        else if (a==true && b==true && percent<=49 ){
            result=false;
            System.out.println("Two male, their interest to talk percent is "+percent+ ", they has nothing about to talk");

        }
        else if (a==true && b==true && percent>49 ){
            result=true;
            System.out.println("Two male, their interest to talk percent is "+percent+ " they has common interest and they talk");

        }
        else {
            System.out.println("Unknown result");
        }

    }
}
