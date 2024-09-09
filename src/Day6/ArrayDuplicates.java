//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class ArrayDuplicates {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of elements in the array");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements in the array");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//            }
//        boolean hasDuplicates = arrayDuplicates(arr);
//        System.out.println("Output: " + hasDuplicates);
//
//        scanner.close();
//    }
//
//    public static boolean arrayDuplicates(int[] nums) {
//        Set<Integer> seen = new HashSet<>();
//
//        for (int num : nums) {
//            if (seen.contains(num)) {
//                return true;
//            }
//            seen.add(num);
//        }
//        return false;
//
//    }
//}
