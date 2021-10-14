package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum {

    public static Float findMaximum(Float a, Float b, Float c) {
        Float max = a;
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
        Float xFloat = 6.3f, yFloat = 3.5f, zFloat = 6.9f;
        Float getMax = Maximum.findMaximum(xFloat,yFloat,zFloat);
        System.out.print(getMax);
    }
}
