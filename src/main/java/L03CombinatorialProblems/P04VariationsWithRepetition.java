package L03CombinatorialProblems;

import java.util.Scanner;

public class P04VariationsWithRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        String[] variations = new String[k];

        variations(elements, 0, variations);

    }

    private static void variations(String[] elements, int index, String[] variations) {
        if (index == variations.length) {
            print(variations);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            variations[index] = elements[i];
            variations(elements, index + 1, variations);
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
