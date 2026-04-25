import java.util.Scanner;

public class UC3 {

    static Scanner scanner = new Scanner(System.in);

    public static int getUserInput() {
        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }

    public static void main(String[] args) {
        int userSlot = getUserInput();

        System.out.println("You selected slot: " + userSlot);
    }
}