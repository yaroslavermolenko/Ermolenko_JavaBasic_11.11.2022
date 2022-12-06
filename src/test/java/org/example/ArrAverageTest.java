package org.example;

import org.junit.Assert;
import org.junit.Test;

public class ArrAverageTest {

    @Test
    public void arrAverageTest() {
        ArrAverage arrAverage = new ArrAverage();
        int[] array = {5, 7, 8, 10, 12, 16, 34, 8};
        double expected = 12.5;
        double actual = arrAverage.average(array);
        Assert.assertEquals(expected, actual, 0);
    }
}