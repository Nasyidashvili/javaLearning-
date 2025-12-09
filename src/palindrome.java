import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word;
        System.out.print("Enter a word, check if word is a palindrome: ");
        word = scanner.nextLine().trim().toLowerCase();
        boolean isPalindome = true;

        for(int i = 0; i < word.length(); i++){
            char firstWord = word.charAt(i);
            char lastWord = word.charAt(word.length() - 1 - i);

            if (firstWord != lastWord){
                isPalindome = false;
                break;
            }
        }

        if (isPalindome){
            System.out.println("Word is palindrome!");
        }
        else{
            System.out.println("Word is not palindrome!");
        }

        scanner.close();
    }
}
