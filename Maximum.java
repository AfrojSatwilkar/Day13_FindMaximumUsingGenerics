package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer xInt = 15, yInt = 9, zInt = 3;
        Float xFloat = 6.2f, yFloat = 4.7f, zFloat = 7.6f;
        String xString = "Apple", yString = "Peach", zString = "Banana";

        new Refactor1(xInt,yInt,zInt).findMaximum();
        new Refactor1(xFloat,yFloat,zFloat).findMaximum();
        new Refactor1(xString,yString,zString).findMaximum();
    }
}
