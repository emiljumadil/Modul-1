
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] inputArray = new int[n];

        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicate(inputArray);
        System.out.println("Output: " + Arrays.toString(uniqueArray));
        scanner.close();
    }

public static int[] removeDuplicate(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : array) {
            uniqueSet.add(num);
        }

        int[] resultArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            resultArray[i++] = num;
        }

        return resultArray;
    }


