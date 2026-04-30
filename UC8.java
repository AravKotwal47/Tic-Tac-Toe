public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            // Assume move, validation, and board update are done in previous UCs

            if (checkWin() || checkDraw()) {
                gameOver = true;
                System.out.println("Game Over");
            } else {
                isHumanTurn = !isHumanTurn; // switch turn
            }
        }
    }

    // Dummy methods (placeholders so code runs)
    static boolean checkWin() {
        return false;
    }

    static boolean checkDraw() {
        return false;
    }
}