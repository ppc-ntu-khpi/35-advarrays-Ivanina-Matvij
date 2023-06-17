# Практична робота "Поглиблене використання масивів"

Завадання : Знайти добуток двох матриць розмірами N x M та M x Q
Я зробив 2 файли Main.java та MatrixOperations.java.

MatrixOperation:

```java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixoperations;

public class MatrixOperations {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;    // Кількість рядків матриці A
        int m = matrixA[0].length; // Кількість стовпців матриці A
        int q = matrixB[0].length; // Кількість стовпців матриці B

        int[][] product = new int[n][q]; // Матриця-результат

        // Знаходимо добуток двох матриць
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < m; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }
}
```
MatrixOperations обчислює добуток двох матриць.

Main: 

```java
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
```
У Main задаються матриці та виводиться результат множення.

Результат:

![alt text for screen readers](https://github.com/ppc-ntu-khpi/35-advarrays-Ivanina-Matvij/blob/master/image/Desktop-screenshot%20(53).png)
