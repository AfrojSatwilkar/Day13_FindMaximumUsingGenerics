package com.company1.Day13_MaximumProblemUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void floatMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(8.342f,4.26f,6.35f);
        Assert.assertEquals(8.342f,actualResult,0.0);
    }

    @Test
    public void floatMax_AtSecondPosition() {
        float actualResult = Maximum.findMaximum(4.786f, 8.72f,3.82f);
        Assert.assertEquals(8.72f,actualResult,0.0);
    }

    @Test
    public void floatMax_AtThirdPosition() {
        float actualResult = Maximum.findMaximum(4.8782f, 5.8722f,10.73f);
        Assert.assertEquals(10.73f,actualResult,0.0);
    }
}
