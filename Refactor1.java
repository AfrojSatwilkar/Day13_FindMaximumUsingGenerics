package com.company1.Day13_MaximumProblemUsingGenerics;

public class Refactor1<E extends Comparable> {

    E[] inputArray;
    public Refactor1(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E findMaximum() {
        return findMaximum(inputArray);
    }
    public static <E extends Comparable> E findMaximum(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
