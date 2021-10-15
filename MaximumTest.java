package com.company1.Day13_MaximumProblemUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(9,5,17);
        Assert.assertEquals(17,actualResult);
    }
}
