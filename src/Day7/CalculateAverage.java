//package Day7;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//
//
//public final class CalculateAverage {
//    public void result() throws FileNotFoundException {
//        CalculateAverage c = new CalculateAverage();
//        int sum = 0;
//        int count = 0;
//
//        System.out.println("Enter number to calculate the average and enter 'q' to finish: ");
//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            String input = scanner.nextLine().trim();
//
//            if (input.equalsIgnoreCase("q")) {
//                break;
//            }
//            try {
//                int number = Integer.parseInt(input);
//                sum += number;
//                count++;
//            }
//            catch (NumberFormatException e){
//                System.out.println("Invalid input. Please enter a valid number or 'q' to finish. ");
//            }
//        }
//        if (count > 0){
//            double average = (double) sum / count;
//            System.out.printf("Output: %.0f\n", average);
//        } else {
//            System.out.println("No valid number entered. Please enter a valid number or 'q' to finish.");
//        }
//    }
//}
