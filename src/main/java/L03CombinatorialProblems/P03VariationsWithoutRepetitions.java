package L03CombinatorialProblems;

import java.util.Scanner;

public class P03VariationsWithoutRepetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        String[] variations = new String[k];
        boolean[] used = new boolean[elements.length];

        variations(elements, 0, variations, used);

    }

    private static void variations(String[] elements, int index, String[] variations, boolean[] used) {
        if (index == variations.length) {
            print(variations);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                variations[index] = elements[i];

                variations(elements, index + 1, variations, used);

                used[i] = false;
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
