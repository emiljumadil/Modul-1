//package Day5;
//import java.util.Scanner;
//
//public class FizzBuzz {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = scanner.nextInt();
//
//        String result = fizzBuzz(n);
//        System.out.println(result);
//
//        scanner.close();
//    }
//
//    public static String fizzBuzz(int n) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                result.append("FizzBuzz");
//            } else if (i % 3 == 0) {
//                result.append("Fizz");
//            } else if (i % 5 == 0) {
//                result.append("Buzz");
//            } else {
//                result.append(i);
//            }
//            if (i < n) {
//                result.append(", ");
//            }
//        }
//
//        return result.toString();
//    }
//}
//
