package TwoDimentional;

public class TwoD {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {2,3,4},
            {5,6,7}
        };
        printMatrix(matrix);
        sumOfRows(matrix);
        largestOnRows(matrix);
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
}
