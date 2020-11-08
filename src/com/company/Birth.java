package com.company;

public class Birth {
    public static void birth(boolean h1, boolean h2, int percent,float a,float b) {
        percent=Random.Random();
        if ((h1==true && h2==false)&&(percent >= 30)&&( (((((a-b)/b)*100)>10  || ((((b-a)/a)*100)>10)) && percent>14))||(((((a-b)/b)*100)<10  || (((b-a)/a)*100)<10) && percent>4)){
        }

    }
}
