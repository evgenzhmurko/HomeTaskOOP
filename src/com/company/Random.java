package com.company;

public class Random {
    public static int Random() {
        int a;
        a = (int) (Math.random() * 99);
        return a;
    }
    public static float RandomFloat() {
        float a;
        a = (float) (Math.random() * 99);
        return a;
    }
}