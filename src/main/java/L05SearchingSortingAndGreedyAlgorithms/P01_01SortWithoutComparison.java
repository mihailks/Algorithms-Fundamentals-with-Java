package L05SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;

public class P01_01SortWithoutComparison {
    public static int[] counts;

    public static void main(String[] args) {


        int[] arr = {5, 3, 6, 7, 1, -1, 5, 10, -22};

        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        counts = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            int currentCount = counts[i];
            while (currentCount-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

}
