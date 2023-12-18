package L02RecursionAndBacktracking;

public class P06QueensPuzzle {
    static char[][] board = new char[8][8];


    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }


        findQueenPositions(0);
    }

    private static void findQueenPositions(int row) {
        if (row == 8) {
            printSolution();
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)) {
                    putQueen(row, col);
                    findQueenPositions(row + 1);//try to place the next queen on the next row
                    removeQueen(row, col); //backtrack
                }
            }
        }
    }

    private static void removeQueen(int row, int col) {
        board[row][col] = '-';
    }

    private static void putQueen(int row, int col) {
        board[row][col] = '*';
    }

    private static boolean canPlaceQueen(int row, int col) {
        for (int c = 0; c < 8; c++) {
            if (board[row][c] == '*') {
                return false; //check if there is a queen in the row
            }
        }

        for (int r = 0; r < 8; r++) {
            if (board[r][col] == '*') {
                return false; //check if there is a queen in the column
            }
        }

        int r = row; //save the initial values of row and col
        int c = col;

        while (r >= 0 && c >= 0) { //mark all positions in the left diagonal as occupied
            if (board[r--][c--] == '*') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r < 8 && c < 8) { //mark all positions in the right diagonal as occupied
            if (board[r++][c++] == '*') {
                return false;
            }
        }

        r = row; //reset r and c to their initial values
        c = col;

        while (r >= 0 && c < 8) { //mark all positions in the left diagonal as occupied
            if (board[r--][c++] == '*') {
                return false;
            }
        }

        r = row; //reset r and c to their initial values
        c = col;

        while (r < 8 && c >= 0) { //mark all positions in the left diagonal as occupied
            if (board[r++][c--] == '*') {
                return false;
            }
        }
        return true;
    }


    private static void printSolution() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
