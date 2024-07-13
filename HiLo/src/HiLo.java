import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "";
        int tries = 0;
        do {
            int guess = 0;
            int theNumber = (int) (Math.random() * 100 + 1);
            while(guess!= theNumber){
                System.out.print("Enter a number between 1 and 100: ");
                guess = input.nextInt();
                tries++;
                if(guess==theNumber){
                    System.out.println("You entered the correct number in " + tries + " tries. You win!");
                    System.out.print("Do u want to play again? (y/n): ");
                    playAgain = input.next();
                    break;
                }else if(guess < theNumber){
                    System.out.println("Number too low");
                }else {
                    System.out.println("Number too high");
                }
            }
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
        input.close();
    }
}