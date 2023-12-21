package L03CombinatorialProblems;

import java.util.Scanner;

public class P05CombinationsWithoutRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        String[] variations = new String[k];

        combinations(elements, 0, 0, variations);

    }

    private static void combinations(String[] elements, int index, int start, String[] variations) {
        if (index == variations.length) {
            print(variations);
        } else {
            for (int i = start; i < elements.length; i++) {
                variations[index] = elements[i];


                combinations(elements, index + 1, i + 1, variations);
            }
        }

    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
