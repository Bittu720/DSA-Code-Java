public class BackTracking7nqueensprint1solution {
   public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; 
    }

    public static boolean nQueens(char board[][], int row) {
        if (row == board.length) {
           // printBoard(board);
           count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }
                board[row][j] = 'x'; // backtrack
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----chess board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    public static int count=0;
    public static void main(String args[]) {
        int n = 4; 
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("solution is not possible");
        }
       // System.out.println("count way = "+count);
    }
} 

