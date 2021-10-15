package com.company1.Day13_MaximumProblemUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void stringMax_AtFirstPosition() {
        String actualResult = Maximum.findMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",actualResult);
    }

    @Test
    public void stringMax_AtSecondPosition() {
        String actualResult = Maximum.findMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",actualResult);
    }

    @Test
    public void stringMax_AtThirdPosition() {
        String actualResult = Maximum.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",actualResult);
    }
}
