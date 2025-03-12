package demo.matrix;

import java.util.Scanner;

public class ProblemOne {
    

    public static void main(String[] args) {
        // m rows and n columns (where m != n)
        // m != n; otherwise that will now be square matrix instead

        // 2 3 4
        // 6 7 8
        Scanner s = new Scanner(System.in);
        // Remember to prompt user for the value of [row][n]

        // it has rows and columns
        // [row][col]
        int[][] matrix = new int[2][3];

        // matrix.length will only get the length of the row
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        // let's try to print the output

        // since we're only trying to print out 3 columns;

        int maxCol = 3;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < maxCol; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
