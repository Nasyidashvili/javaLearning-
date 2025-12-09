import java.util.Scanner;
import java.util.Random;

public class guessGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("Number Guessing game");
        System.out.print("Guess a number between 1 and 10: ");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! try again");
            }
            else {
                System.out.println("CORRECT! The number was  " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        scanner.close();
    }
}
