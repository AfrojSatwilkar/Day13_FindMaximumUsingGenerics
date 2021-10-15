package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer[] a = { 1, 2, 3, 4, 5 };
        Float[] b = { 2.9f, 9.1f, 8.3f, 4.6f, 3.7f};
        String[] c = { "Peach", "Apple", "Banana", "Mango", "Grape" };

        System.out.println(new Refactor1<Integer>(a).findMaximum());
        System.out.println(new Refactor1<Float>(b).findMaximum());
        System.out.println(new Refactor1<String>(c).findMaximum());
    }
}