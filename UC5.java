public class UC5 {

    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds!");
            return false;
        }

        if (board[row][col] != '-') {
            System.out.println("Invalid move: Cell already occupied!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', '-', '-'},
            {'-', 'O', '-'},
            {'-', '-', '-'}
        };

        int row = 0;
        int col = 0;

        if (isValidMove(board, row, col)) {
            System.out.println("Move is valid!");
        } else {
            System.out.println("Move is not valid!");
        }
    }
}