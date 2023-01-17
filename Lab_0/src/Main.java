import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        float celsius_degree = in.nextFloat();

        float fahrenheit_degree = (float) (9.0/5.0 * celsius_degree + 32);

        System.out.print(celsius_degree + " Celsius is " + fahrenheit_degree + " degrees fahrenheit.");

    }
}