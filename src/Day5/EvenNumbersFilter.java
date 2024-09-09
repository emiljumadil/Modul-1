//package Day5;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class EvenNumbersFilter {
//
//    public static int[] removeOddNumbers(int[] inputArray) {
//
//        ArrayList<Integer> evenNumbersList = new ArrayList<>();
//
//        for (int number : inputArray) {
//            if (number % 2 == 0) {
//                evenNumbersList.add(number);
//            }
//        }
//
//        int[] resultArray = new int[evenNumbersList.size()];
//        for (int i = 0; i < evenNumbersList.size(); i++) {
//            resultArray[i] = evenNumbersList.get(i);
//        }
//
//
//        return resultArray;
//    }
//
//    public static void main(String[] args) {
//        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] resultArray = removeOddNumbers(inputArray);
//
//        System.out.println("Array with even numbers only: " + Arrays.toString(resultArray));
//    }
//}
