// package Day4;
//import java.util.Scanner;
//
//
//    public class SwapCase {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter The Character:");
//
//            String input = scanner.nextLine();
//            String swappedCaseString = swapCase(input);
//
//            System.out.println("Original String: " + input);
//            System.out.println("Swapped Case String: " + swappedCaseString);
//
//            scanner.close();
//        }
//
//        public static String swapCase(String str) {
//            StringBuilder result = new StringBuilder();
//
//            for (char c : str.toCharArray()) {
//                if (Character.isUpperCase(c)) {
//                    result.append(Character.toLowerCase(c));
//                } else if (Character.isLowerCase(c)) {
//                    result.append(Character.toUpperCase(c));
//                } else {
//                    result.append(c);
//                }
//            }
//
//            return result.toString();
//        }
//    }