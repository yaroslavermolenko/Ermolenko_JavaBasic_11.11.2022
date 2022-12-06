package org.example;

public class SquareMatrix {

    public boolean squareCheck(int[][] array) {
        if (array.length == array[0].length) {
            return true;
        } else {
            return false;
        }
    }
}