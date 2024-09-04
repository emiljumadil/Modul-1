package Day3;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expansion: ");
        String input = scanner.nextLine();

        // Input into number
        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            System.out.println("Input not valid. Use format: number operator number");
            scanner.close();
            return;
        }

        try {
            // Take the number
            double num1 = Double.parseDouble(tokens[0]);
            double num2 = Double.parseDouble(tokens[2]);
            char operator = tokens[1].charAt(0);

            double result;

            // Do the calculator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: zero division is not allowed.");
                        scanner.close();
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Is not valid. Use +, -, *, or /.");
                    scanner.close();
                    return;
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number.");
        } finally {
            scanner.close();
        }
    }
}