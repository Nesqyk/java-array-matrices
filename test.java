public class test {
   
    
    public static void main(String[] args)
    {
        // int[][] num = new int[3][2];

        // int lengthRowOne = num[0].length;

        // System.out.println(lengthRowOne); // 

        // for(int row = 0 ; row < num.length; row++) {
        //     for (int col = 0; col < num[row].length; col++) {
        //         System.out.print(num[row][col]  + " ");
        //     }
        //     System.out.println();
        // }

        // int[][] board = new int[5][];

        // board[0] = new int[6];
        // board[1] = new int[2];
        // board[2] = new int[5];
        // board[3] = new int[3];
        // board[4] = new int[4];

        // for (int row = 0; row < board.length; row++) {
        //     for (int col = 0; col < board[row].length; col++) {
        //         System.out.print(board[row][col]  + " ");
        //     }
        //     System.out.println();
        // }

        int[][] board = {
            {1,2,3}, // row 1
            {2,1,4}, // row 2
            {4,5,3} // row 3
        };

        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
