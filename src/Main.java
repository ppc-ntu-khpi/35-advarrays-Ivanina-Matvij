package com.mycompany.matrixoperations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] product = MatrixOperations.multiplyMatrices(matrixA, matrixB);

        // Виведення результату
        for (int[] row : product) {
            System.out.println(Arrays.toString(row));
        }
    }
}
