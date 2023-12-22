package L05SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class P01BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int key = Integer.parseInt(scanner.nextLine());

//        System.out.println(indexOf(arr, key)); // iterative

        // RECURSIVE
        int start = 0;
        int end = arr.length - 1;

        System.out.println(indexOf(arr, start, end, key));
    }

    private static int indexOf(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

//            int mid = (start + end) / 2;
//            int mid = start  + ((end - start) / 2);
            int mid = (start + end) >>> 1;

            int current = arr[mid];

            if (key < current) {
                end = mid - 1;
            } else if (key > current) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int indexOf(int[] arr, int start, int end, int key) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return indexOf(arr, start, mid - 1, key);
            }
            return indexOf(arr, mid + 1, end, key);
        }
        return -1;
    }
}
