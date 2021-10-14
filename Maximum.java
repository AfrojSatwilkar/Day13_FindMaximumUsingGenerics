package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer xInt = 5, yInt = 9, zInt = 3;
        Float xFloat = 6.2f, yFloat = 4.7f, zFloat = 7.6f;
        String xString = "Apple", yString = "Peach", zString = "Banana";

        Refactor1 refactor1 = new Refactor1<Integer>();

        System.out.println("Maximum Integer : "+ refactor1.findMaximum(xInt,yInt,zInt));
        System.out.println("Maximum Float : "+ refactor1.findMaximum(xFloat,yFloat,zFloat));
        System.out.println("Maximum String : "+ refactor1.findMaximum(xString,yString,zString));
    }
}
