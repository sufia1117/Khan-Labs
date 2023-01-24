import java.util.Random;
import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        // Computer chooses random number between 1 and 5
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(6);
            if (rand != 0) break;
        }

        // Assign each move to a number 1 to 5
        if (rand == 1) {
            String computerChoice = "rock";
        }
        else if (rand == 2) {
            String computerChoice = "paper";
        }
        else if (rand == 3) {
            String computerChoice = "scissors";
        }
        else if (rand == 4) {
            String computerChoice = "lizard";
        }
        else if (rand == 5) {
            String computerChoice = "spock";
        }

        // Print numbers and corresponding moves for user
        System.out.print("1) rock\n2) paper\n3)scissors\n4)lizard\n5)spock");
        System.out.print("Enter a number corresponding to your preferred move: ");

        // Ask user to choose a number
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        // Print corresponding move to user's number choice
        if (userChoice == 1){
            System.out.print("You chose rock");
        }
        else if (userChoice == 2) {
            System.out.print("You chose paper");
        }
        else if (userChoice == 3) {
            System.out.print("You chose scissors");
        }
        else if (userChoice == 4) {
            System.out.print("You chose lizard");
        }
        else if (userChoice == 5) {
            System.out.print("You chose spock");
        }
    }
}