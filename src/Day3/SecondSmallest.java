package Day3;

//public class SecondSmallest {
//    public static void main(String[] args) {
//        // Difine array
//        int[] arr = {5, 3, 8, 1, 2, 9};
//
//        // Input array
//        int secondSmallest = findSecondSmallest(arr);
//        System.out.println("The element in an array: " + secondSmallest);
//    }
//
//    public static int findSecondSmallest(int[] arr) {
//        // Find smallest elemen
//        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
//
//        // Initialize two variable
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
