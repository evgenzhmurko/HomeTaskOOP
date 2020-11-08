package com.company;

import java.util.Scanner;

public class Human {
    boolean sexIsMale;
    String name;
    String lastName;
    float height;
    float weight;



    public Human( ) {


            Scanner scannerGender = new Scanner(System.in);
            System.out.print("What is your gender? Type Male or Female ");
            String sexIsMale1= scannerGender.next();
            if (sexIsMale1.equals("Male")){
                sexIsMale = true;
            }
            else if (sexIsMale1.equals("Female")){
                sexIsMale = false;

            }
            else{
                System.out.println("Unknown result");

            }
            Scanner scannerName = new Scanner(System.in);
            System.out.print("What is your name ");
            name= scannerName.next();
            Scanner scannerLastName = new Scanner(System.in);
            System.out.print("What is your last name ");
            lastName= scannerLastName.next();
            Scanner scannerHeight = new Scanner(System.in);
            System.out.print("What is your heigh ");
            height= scannerHeight.nextFloat();
            Scanner scannerWeight = new Scanner(System.in);
            System.out.print("What is your weigh ");
            weight= scannerWeight.nextFloat();



        }

}


