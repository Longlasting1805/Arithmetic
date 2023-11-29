import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate and display the sum, product, difference, and quotient
        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;

        //Ensure that num2 is not zero before calculating the quotient to avoid division by zero
        double quotient = (number2 != 0) ? (double) number1 / number2 : Double.POSITIVE_INFINITY;

        //display the results
        System.out.println("sum: " + sum);
        System.out.println("product: " + product );
        System.out.println("Differences: " + difference);
        System.out.println("quotient: " + quotient);



    }
}
