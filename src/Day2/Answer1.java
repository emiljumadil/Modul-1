import java.util.Scanner;

public class Answer1 {
    private static Object Public;


      public static void runExercises() {
         // Answer 1
         Scanner scanner = new Scanner(System.in);
         System.out.println("In put temperature to fahrenheit");
         double rawtemPerature = scanner.nextDouble();
         double celsius = rawtemPerature * 1.8 + 32;
         System.out.println("Temperature in Celsius: " + celsius);

     }

     public static double runExercises(double centimeter) {
         // Answer 2
//         return centimeter / 100000.0; // 1 kilometer = 100000 centimeter
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the value of Centimeter");
         double Centimeter = scanner.nextDouble();

         // Change distace
         double kilometer = (centimeter);
         System.out.println("Kilometer = " + kilometer);
         scanner.close();
      return kilometer;}

     public static boolean isOdd(int n) {
//     // Answer 3
         return n % 2 != 0;
     }

     public static void main(String[] args) {
         boolean isGitInstalled;
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         Boolean result = isOdd(n);
         System.out.println("The number is odd: " + result);
         scanner.close();

     }
 }

     // Answer 4
     public static double runExercises(String[] args) {
         Scanner scaner = new Scanner(System.in);

      //   String Main and search
         String mainString = "Hello world";
         String searchString = "ell" + "Ho world";

      //   Remove
         String resultString = (mainString, searchString);

         System.out.println("Enter the first occurrence of " + mainString);
         System.out.println("Enter the second occurrence of " + searchString);
         System.out.println("String" + resultString);

         int index = resultString.indexOf(searchString);
         int index = scaner.nextInt();
         scaner.close();
     }

     public class PalindromeChecker {

         // Answer 5
         public static void main (String[] args) {
             Scanner scaner = new Scanner(System.in);

          //   String input
             System.out.println("Enter string:");
             String inputString = scaner.nextLine();

          //   Check inputString is palindrom
             boolean isPalindrome = inputString.equals(inputString);

          //   Result
             if (isPalindrome) {
                 System.out.println(inputString + " is a palindrome");
             } else {
                 System.out.println(inputString + " is not a palindrome");
             }
             scaner.close();
         }






