package L02RecursionAndBacktracking;

import java.util.Scanner;

public class P03Generating01Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] memory = new Integer[n];
        fillVector(memory, 0);

    }

    public static void fillVector(Integer[] memory, int index) {
        if (index >= memory.length) {
            print(memory);
            return;
        }

        for (int i = 0; i <= 1; i++) {
            memory[index] = i;
            fillVector(memory, index + 1);
        }
    }

    public static void print(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
}
