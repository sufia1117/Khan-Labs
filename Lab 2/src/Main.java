import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Acquire integers from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integers, the input ends if 0 is entered: ");
        int number = in.nextInt();

        // End loop once 0 is entered and count positives and negatives
        int pos = 0;
        int neg = 0;
        double total = 0;
        while (number != 0){
            if (number > 0){
                pos++;
            }else{
                neg++;
            }
            total += number;
            number = in.nextInt();
        }
        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);

        // Add all numbers to find sum
        System.out.println("The total is " + total);

        // divide all ints except 0 by number of inputs
        int length = pos + neg;
        double avg = total / length;
        System.out.println("The average is " + avg);
    }
}