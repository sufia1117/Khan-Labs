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
    }
}