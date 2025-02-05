import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        
        int guess = 0;
        int attempts = 0;
        
        while (guess != randomNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            
            guess = scanner.nextInt();
            attempts++;  
            
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        }

        System.out.println("Congratulations! You've guessed the number correctly.");
        System.out.println("It took you " + attempts + " attempts.");
        
        scanner.close();
    }
}
