package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum {

    public static String findMaximum(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max)>0 && b.compareTo(c)>0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        String xString = "Apple", yString = "Peach", zString = "Banana";
        String getMax = Maximum.findMaximum(xString,yString,zString);
        System.out.print(getMax);
    }
}
