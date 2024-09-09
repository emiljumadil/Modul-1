//package Day6;
//import java.util.Arrays;
//
//public class ArrayRotation {
//    static void rotate(int[] arr, int d, int n) {
//        int temp[] = new int[n];
//        int k = 0;
//
//        for (int i = d; i < n; i++) {
//            temp[k++] = arr[i];
//            k++;
//        }
//        for (int i = 0; i < d; i++) {
//            arr[i] = temp[i];
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i] = temp[i];
//        }
//    }
//    static void PrintTheArray(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + "");
//        }
//    }
//    public static int rotate() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pick rotator number :");
//        int rotator = scanner.nextInt();
//        scanner.nextInt();
//        int[] temp = new int[rotator];
//
//        int[] arr = new int[0];
//        int i;
//        for (i = 0; i < rotator; i++) {
//            temp[i] = arr[i]; //d=2 -> [1][2]
//        }
//        return temp[i];
//    }
//}
