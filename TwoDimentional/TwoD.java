package TwoDimentional;


import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1,2,3},
        //     {2,3,4},
        //     {5,6,7}
        // };
        // printMatrix(matrix);
        // sumOfRows(matrix);
        // largestOnRows(matrix);

        //inititalizationExample();

        inptuExampleScanner();
    }

    public static void printMatrix(int[][] matrix)
    {
        int rowSize = matrix.length;

        for (int row = 0; row < rowSize; row++) 
        {
            for(int col = 0 ; col < matrix[row].length; col++)
            {
                System.out.printf("%7d", matrix[row][col]);
            }
            System.err.println();
        }
    }

    public static void sumOfRows(int[][] matrix)
    {
        int sum;
        for (int row = 0; row < matrix.length; row++) 
        {
            sum = 0;
            for(int col = 0; col < matrix[row].length; col++)
            {
                sum += matrix[row][col];
            }
            System.out.println("Sum of Row No." + (row + 1) + " : " + sum);
        }
    }

    public static void largestOnRows(int[][] matrix)
    {
        int largest;
        for (int row = 0; row < matrix.length; row++) 
        {
            largest = matrix[row][0];
            for(int col = 0; col < matrix[row].length; col++) 
            {
                if(largest < matrix[row][col])
                {
                    largest = matrix[row][col];
                }
            }
            System.out.println("Largest Element for Row No." + (row + 1) + " is " + largest);
        }
    }

    public static void inititalizationExample() {

        int[][] matrix = new int[3][3]; // Ganahan ka initialize sila tnan to 10?

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 10;
                System.err.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void inptuExampleScanner() {
        Scanner s = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            System.out.print("Please enter 3 numbers for Row #" + (row + 1) + " ");
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = s.nextInt();
            }
            System.out.println();
        }

        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Elements for  Row #" + (row + 1) + ": ");
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
