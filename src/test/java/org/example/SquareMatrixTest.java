package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SquareMatrixTest {

    @Test
    public void squareMatrixPosTest() {
        SquareMatrix squareMatrix = new SquareMatrix();
        int[][] array = {
                {2, 2},
                {2, 2}};
        boolean expected = true;
        boolean actual = squareMatrix.squareCheck(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareMatrixNegTest() {
        SquareMatrix squareMatrix = new SquareMatrix();
        int[][] array = {
                {2, 2},
                {2, 2},
                {2, 2}};
        boolean expected = false;
        boolean actual = squareMatrix.squareCheck(array);
        Assert.assertEquals(expected, actual);
    }
}