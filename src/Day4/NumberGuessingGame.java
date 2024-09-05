//package Day4;
//
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class NumberGuessingGame {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("please enter a number between 1 and 100: ");
//        int n = 0;
//        int attempts = 0;
//
//        do{
//            n = sc.nextInt();
//            attempts++;
//
//            Random rand = new Random();
//            int randomNumber = rand.nextInt(100) + 1;
//            int userGuess = 0;
//
//            if (n > randomNumber){
//                System.out.println("Your number is too high, try again");
//            } else if (n < randomNumber){
//                System.out.println("Your number is too low, try again");
//            } else {
//                System.out.println("Your number is correct");
//                System.out.println("Your total attempts: " + attempts);
//            }
//        }
//        while(attempts < 5);
//
//    }
//}
