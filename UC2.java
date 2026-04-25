import java.util.Random;

public class UC2 {

    static char playerSymbol;
    static char computerSymbol;
    static char currentPlayer;

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("\nTic-Tac-Toe Board:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2); 

        if (result == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = playerSymbol;
            System.out.println("Player won the toss! You play first.");
        } else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = computerSymbol;
            System.out.println("Computer won the toss! Computer plays first.");
        }

        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        initializeBoard(board);
        displayBoard(board);

        toss(); 
    }
}