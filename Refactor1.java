package com.company1.Day13_MaximumProblemUsingGenerics;

public class Refactor1 {
    public static <E extends Comparable>E findMaximum(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max)>0 && b.compareTo(c)>0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}