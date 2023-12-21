package L03CombinatorialProblems;

import java.util.Scanner;

public class P01PermutationsWithoutRepetitions {
    //More memory used

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] elements = scanner.nextLine().split("\\s+");
//
//        String[] permutes = new String[elements.length];
//
//        boolean[] used = new boolean[elements.length];
//
//        permute(elements, 0, permutes, used);
//
//    }
//
//    private static void permute(String[] elements, int index, String[] permutes, boolean[] used) {
//        if (index == elements.length) {
//            print(permutes);
//            return;
//        }
//        for (int i = 0; i < elements.length; i++) {
//            if (!used[i]) {
//                used[i] = true;
//                permutes[index] = elements[i];
//                permute(elements, index + 1, permutes, used);
//                used[i] = false;
//            }
//        }
//
//    }
//
//    private static void print(String[] permutes) {
//        System.out.println(String.join(" ", permutes));
//    }


    // swap algorithm
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
        for (int i = index + 1; i < elements.length; i++) { //+1 because we don't want to swap with itself and we want to swap with the next element
            swap(index, i, elements); //swap the first element with the next one
            permute(elements, index + 1);
            swap(index, i, elements); //swap back to the original order so we can swap with the next element
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
