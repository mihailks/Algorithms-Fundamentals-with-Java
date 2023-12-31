package L02RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class P01RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int recursiveSum;
        recursiveSum = calculateSumRec(arr, 0);
        System.out.println(recursiveSum);

    }

    public static int calculateSumRec(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }

        return arr[index] + calculateSumRec(arr, index + 1);
    }
}
