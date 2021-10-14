package com.company1.Day13_MaximumProblemUsingGenerics;

public class Maximum<E extends Comparable<E>> {
    E a, b, c;
    public Maximum(E a,E b,E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E findMaximum(){
        return Maximum.findMaximum(a,b,c);
    }

    public static <E extends Comparable<E>>E findMaximum(E a, E b, E c) {
        E max = a;
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
        Integer xInt = 5, yInt = 9, zInt = 3;
        Float xFloat = 6.2f, yFloat = 4.7f, zFloat = 7.6f;
        String xString = "Apple", yString = "Peach", zString = "Banana";
        System.out.println("Maximum Integer : "+ new Maximum(xInt,yInt,zInt).findMaximum());
        System.out.println("Maximum Float : "+ new Maximum(xFloat,yFloat,zFloat).findMaximum());
        System.out.println("Maximum String : "+ new Maximum(xString,yString,zString).findMaximum());
    }
}
