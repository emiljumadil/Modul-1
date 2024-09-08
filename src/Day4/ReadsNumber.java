//package Day4;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadsNumber {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        List<Integer> number = new ArrayList<>();
//        while (true){
//            System.out.print("Enter a number: ");
//            int num = input.nextInt();
//            number.add(num);
//
//            System.out.print("Press 'y' to continue, 'n' to stop: ");
//            char ch = input.next().charAt(0);
//
//            if(ch == 'n' || ch == 'N') {
//                break;
//            } else if (ch != 'y' && ch != 'Y') {
//                System.out.println("Invalid input. Exiting the program.");
//                break;
//            }
//    }
//        System.out.println("Numbers entered: " + number.size());
//
//    }
//}
