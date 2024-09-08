//package Day5;
//import java.util.Scanner;
//
//public class CurrencyConversion {
//    public static void main (String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to the Currency Converter!");
//
//        while (true) {
//
//            System.out.println("Enter the amount to convert");
//            System.out.println("Enter the source currency (USD, EUR, GBP, or JPY):");
//            System.out.println("Enter the target currency (USD, EUR, GBP, or JPY):");
//            int sourceCurrency = input.nextInt();
//            int targetCurrency = input.nextInt();
//
//        }
//        // Conversion rates
//        private double USD_TO_EUR = 0.92;
//        private static double EUR_TO_USD = 1.18;
//        private static double USD_TO_GBP = 0.79;
//        private static double USD_TO_JPY = 147.65;
//
//        // Method to convert USD to EUR
//        private static void convertUSDToEUR () {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the amount in USD: ");
//            double usdAmount = scanner.nextDouble();
//            double eurAmount = usdAmount * USD_TO_EUR;
//            System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");
//        }
//
//        // Method to convert EUR to USD
//        private static void convertEURToUSD () {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the amount in EUR: ");
//            double eurAmount = scanner.nextDouble();
//            double usdAmount = eurAmount * EUR_TO_USD;
//            System.out.println(eurAmount + " EUR is equivalent to " + usdAmount + " USD");
//        }
//
//        // Method to convert USD to GBP
//        private static void convertUSDToGDP () {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the amount in EUR: ");
//            double eurAmount = scanner.nextDouble();
//            double usdAmount = eurAmount * USD_TO_GBP;
//            System.out.println(eurAmount + " USD is equivalent to " + usdAmount + " GBP");
//        }
//
//        // Method to convert USD to JPY
//        private static void convertUSToJPY () {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the amount in EUR: ");
//            double eurAmount = scanner.nextDouble();
//            double usdAmount = eurAmount * USD_TO_JPY;
//            System.out.println(eurAmount + " USD is equivalent to " + usdAmount + " JPY");
//        }
//    }
//}
//
