//
//import java.util.Scanner;
//
//public class MultiplicationTable {
//    public static void printMultiplicationTable(int n) {
//
//        System.out.println("  ");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("%4d", i);
//        }
//        System.out.println();
//
//        System.out.print("");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("____");
//        }
//        System.out.println();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.printf("%2d |", i);
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number for rows:");
//        int n = scanner.nextInt();
//        printMultiplicationTable(n);
//    }
//}
//
//
