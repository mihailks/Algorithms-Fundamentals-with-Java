package L02RecursionAndBacktracking;

import java.util.Scanner;

public class P07RecursiveFibonacci {
    public static long[] fibArr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        fibArr = new long[n+1];

        fibArr[0] = 1;
        fibArr[1] = 1;
        long result = fibRec(n);
        System.out.println(result);
    }

    public static long fibRec(int n) {
        if (n <= 1) {
            return 1;
        } else if (fibArr[n] != 0) {
            return fibArr[n];
        } else {
            long result = fibRec(n - 1) + fibRec(n - 2);
            fibArr[n] = result;
            return result;
        }
    }

}
