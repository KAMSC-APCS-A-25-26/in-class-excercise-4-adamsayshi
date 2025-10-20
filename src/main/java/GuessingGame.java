import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
        Scanner sc = new Scanner(System.in);
        int rand = new Random().nextInt(100);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int user = 0;
        do {
            System.out.print("Enter your guess: ");
            user = sc.nextInt();
            if (user > rand) {
                System.out.println("Too high! Try again.");
            } else if (user < rand){
                System.out.println("Too low! Try again.");
            }
        }while (user != rand);
        System.out.println("You got it!");
    }
}
