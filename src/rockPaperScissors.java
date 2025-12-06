import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1;
        String player2;

        System.out.print("Player1 Make a move (Rock, Scissors, Paper):");
        player1 = scanner.nextLine().toLowerCase().trim();

        System.out.print("Player2 Make a move (Rock, Scissors, Paper):");
        player2 = scanner.nextLine().toLowerCase().trim();

        if (player1.equals("rock") && player2.equals("scissors")) {
            System.out.println("Player 1 wins!");
        }
        else if (player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("Player 1 wins!");
        }
        else if (player1.equals("paper") && player2.equals("rock")) {
            System.out.println("Player 1 wins!");
        }

        else if (player2.equals("rock") && player1.equals("scissors")) {
            System.out.println("Player 2 wins!");
        }
        else if (player2.equals("scissors") && player1.equals("paper")) {
            System.out.println("Player 2 wins!");
        }
        else if (player2.equals("paper") && player1.equals("rock")) {
            System.out.println("Player 2 wins!");
        }
        else if (player1.equals(player2)) {
            System.out.println("It's draw!");
        }

        scanner.close();
    }
}
