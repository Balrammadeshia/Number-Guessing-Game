
import java.util.Scanner;
 
public class NumberGuessingGame {
 
    
    
    public static void
    NumberGuessingGame()
    {
        
        Scanner sc = new Scanner(System.in);
 
        
        int number = 1 + (int)(100
                               * Math.random());
 
        
        int K = 5;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 attempts.");
 
        
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            
            guess = sc.nextInt();
 
            
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "higher than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " lower than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println(
                "You have exhausted"
                + " K attempts.");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
    
    public static void
    main(String arg[])
    {
 
        
        NumberGuessingGame();
    }
}