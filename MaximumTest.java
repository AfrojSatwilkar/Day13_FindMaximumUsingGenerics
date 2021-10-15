package com.company1.Day13_MaximumProblemUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void intMax() {
        int actualResult = Refactor1.findMaximum(2,8,5);
        Assert.assertEquals(8,actualResult);
    }
    @Test
    public void floatMax() {
        float actualResult = Refactor1.findMaximum(5.37f,8.25f,2.73f);
        Assert.assertEquals(8.25f,actualResult,0.0);
    }
    @Test
    public void stringMax() {
        String actualResult = Refactor1.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",actualResult);
    }
}
