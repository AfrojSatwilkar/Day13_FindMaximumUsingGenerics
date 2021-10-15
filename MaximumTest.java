package com.company1.Day13_MaximumProblemUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void integerMax_AtSecondPosition() {
        int actualResult = Maximum.findMaximum(9,15,7);
        Assert.assertEquals(15,actualResult);
    }
}
