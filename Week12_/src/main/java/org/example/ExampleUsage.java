package org.example;

public class ExampleUsage {

    // Method to demonstrate using loops to filter data
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    // Method to sum an array of integers demonstrating the use of loops and variable scope
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    // Example of using nested loops to process multidimensional data
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }

    // Task 4: Method to filter and count even numbers in an array of integers from 1 to 20
    // Using a foreach loop and adhering to all specified Checkstyle rules
    public int filterAndCountEvenNumbers() {
        int[] numbers = new int[20];
        for (int i = 1; i <= 20; i++) {
            numbers[i - 1] = i;
        }
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
                System.out.println("Even number: " + number);
            }
        }
        System.out.println("Total even numbers: " + count);
        return count;
    }

    // Task 5: Method to calculate the sum of the diagonal elements of a 3x3 matrix
    // Ensuring correct loop variable usage and scope
    public int matrixDiagonalSum() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
        return sum;
    }
}
