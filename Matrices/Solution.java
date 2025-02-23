package Matrices;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    
        squareMatrixSum();
    }

    // Method One for Problem 1. Rectangular Matrix
    public static String rectangleMatrixStr(int[] matrix)
    {
        int matrixLength = matrix.length;
        String rectangleStr = "";

        for (int i = 0; i < matrixLength; i++) {
            rectangleStr += matrix[i] + " ";
            if(((i + 1) % 3) == 0) {
                rectangleStr += "\n";
            }
        }
        return rectangleStr;
    }


    // Method Two for Problem 1. Rectangular Matrix
    // 2 x 3
    public static void rectangleMatrix() {
        Scanner s = new Scanner(System.in);

        int[][] matrix = new int[2][3];
        // Input: Filling the matrix with user input
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) { // Fixed  < matrix[row].length'
                matrix[row][col] = s.nextInt(); // Taking input for each element
            }
        }

        int maxCol = 3; // Define the maximum number of columns to be printed

        // Output: Printing the matrix in rectangular form
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < maxCol; col++) {
                System.out.print(matrix[row][col] + " "); // Print each element with a space
            }
            System.out.println(); // Move to the next line after printing a row
        }

        s.close(); // Close the scanner to prevent resource leaks
    }

    // Remember: A square matrix can only be called a matrix if its rom and column is equal.
    // Solution for Problem 2.
    // 3 x 3
    public static void squareMatrixSum() {
        Scanner s = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int sum = 0;

        // Check if it's a square matrix
        if (rowSize != colSize) {
            System.out.println("Column and Row are not equal. This is not a square matrix.");
        }

        System.out.println("Enter 9 elements: ");

        // Input: Fill the matrix
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                matrix[row][col] = s.nextInt();
                sum += matrix[row][col];
            }
        }
        System.out.println("Sum of elements: " + sum);
        s.close(); // Close the scanner
    }

    public static void validDiagonalMatrix() {
        Scanner s = new Scanner(System.in);

        int[][] matrix = new int[3][3]; // Assuming a fixed 3x3 matrix
        boolean valid = true; // Assume it's valid initially

        // Input: Fill the matrix
        System.out.println("Enter 9 elements for a 3x3 matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        // Check diagonal validity
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) { 
                    // Main diagonal should have nonzero values
                    if (matrix[row][col] == 0) {
                        valid = false;
                    }
                } else {
                    // All non-diagonal elements should be zero
                    if (matrix[row][col] != 0) {
                        valid = false;
                    }
                }
            }
        }

        // Output result
        if (valid) { // Remember: Truthy and falsy values
            System.out.println("The matrix is a valid diagonal matrix.");
        } else {
            System.out.println("The matrix is NOT a diagonal matrix.");
        }

        s.close();
    }
}
