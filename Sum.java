import java.util.Scanner; // Importing the Scanner class for user input
public class Sum{ // Class declaration
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.println("Enter the first number:"); // Prompting the user to enter the first number
        int num1 = scanner.nextInt(); // Reading the first integer input from the user
        System.out.println("Enter the second number:"); // Prompting the user to enter the second number
        int num2 = scanner.nextInt(); // Reading the second integer input from the user
        int sum = num1 + num2; // Calculating the sum of the two numbers
        // Printing the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

