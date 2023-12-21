package L03CombinatorialProblems;

import java.util.HashSet;
import java.util.Scanner;

public class P02PermutationsWithRepetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");

        permute(elements, 0);

    }

    private static void permute(String[] elements, int index) {
        if (index == elements.length) {
            print(elements);
            return;
        }
        permute(elements, index + 1);

        HashSet<String> swapped = new HashSet<>();
        swapped.add(elements[index]);

        for (int i = index + 1; i < elements.length; i++) { //+1 because we don't want to swap with itself and we want to swap with the next element
            if (!swapped.contains(elements[i])) {
                swap(index, i, elements); //swap the first element with the next one
                permute(elements, index + 1);
                swap(index, i, elements); //swap back to the original order so we can swap with the next element
                swapped.add(elements[i]);
            }
        }
    }

    private static void swap(int index, int i, String[] arr) {
        String temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
