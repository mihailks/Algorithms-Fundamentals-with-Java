package L02RecursionAndBacktracking;

import java.util.Scanner;

public class P02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printFigure(n);
    }

    public static void printFigure(int n) {
        if (n < 1) {
            return;
        }
        printLineOfChars('*', n);
        printFigure(n - 1);
        printLineOfChars('#', n);
    }

    public static void printLineOfChars(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
