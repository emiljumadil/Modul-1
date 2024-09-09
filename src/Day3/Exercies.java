
//package Day3;

import java.util.Scanner;

//public class Exercies {
//    private static Object Public;


    //  // Answer 1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        // Input
//        System.out.println("");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        // Output
//        System.out.println(" 10 ");
//        for (int i = 0; i < n; i++)
//            arr[i] = scanner.nextInt();
//
//
//    }
//
//    // Answer 2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean numberIsPrime = true;
//        boolean numberISNotPrime = false;
//        System.out.println("Enter the number: ");
//        int number = scanner.nextInt();
//
//        for (int i = 2; i <= number; i++);
//        if (number % 1 == 0);
//        System.out.println(number + " is Prime or Not Prime");
//
//
//    }
//
//      // Answer 3
//  public static int findLargest(int[] array) {
//    int largest = array[0];
//
//    // Interate thougt the arry to find the largest element
//    for (int i = 1; i < array.length; i++) {
//        if (array[i] > largest) {
//            largest = array[i];
//        }
//    }
//    return largest;
//}
//    public static void main(String[] args) {
//        int[] numbers = {3, 7, 2, 8, 1};
//
//        // Find the largest elemen
//        int largest = findLargest(numbers);
//        System.out.println("The largest element in the attay is: " + largest);
//    }
//
//
//
//     Answer 4
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the expansion: ");
//        String input = scanner.nextLine();
//
//        // Input into number
//        String[] tokens = input.split(" ");
//        if (tokens.length != 3) {
//            System.out.println("Input not valid. Use format: number operator number");
//            scanner.close();
//            return;
//        }
//
//        try {
//            // Take the number
//            double num1 = Double.parseDouble(tokens[0]);
//            double num2 = Double.parseDouble(tokens[2]);
//            char operator = tokens[1].charAt(0);
//
//            double result;
//
//            // Do the calculator
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    if (num2 == 0) {
//                        System.out.println("Error: zero division is not allowed.");
//                        scanner.close();
//                        return;
//                    }
//                    result = num1 / num2;
//                    break;
//                default:
//                    System.out.println("Is not valid. Use +, -, *, or /.");
//                    scanner.close();
//                    return;
//            }
//
//            System.out.println("Result: " + result);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Invalid number.");
//        } finally {
//            scanner.close();
//        }
//
//    }

////     Answer 5
//          public static String reverseString(String input) {
//              Scanner scanner = new Scanner(System.in);
//              String reversed = "";
//
//              for (int i= input.length() - 1; i >= 0; i--);
//              reversed +
//          }
//
////   Answer 6
//
//      public static void main(String[] args) {
//          int n = 6; // number of terms
//          printFibonacci(n);
//      }
//
//      public static void printFibonacci(int n) {
//          int first = 0, second = 1;
//
//          System.out.print(first + ", " + second); // Print the first two terms
//
//          for (int i = 2; i < n; i++) { // Loop starts from 2 because first two terms are already printed
//              int next = first + second;
//              System.out.print(", " + next);
//              first = second;
//              second = next;
//          }
//      }
//
// //        Answer 10
//
//    public static void main(String[] args) {
//        int[] arr = {5, 3, 8, 1, 2, 9}; // Input array
//        int secondSmallest = findSecondSmallest(arr);
//        System.out.println("The element in an array: " + secondSmallest);
//    }
//
//    public static int findSecondSmallest(int[] arr) {
//        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
//
//        for (int num : arr) {
//            if (num < firstSmallest) {
//                secondSmallest = firstSmallest;
//                firstSmallest = num;
//            } else if (num < secondSmallest && num != firstSmallest) {
//                secondSmallest = num;
//            }
//        }
//
//        return secondSmallest;
//    }

//}
