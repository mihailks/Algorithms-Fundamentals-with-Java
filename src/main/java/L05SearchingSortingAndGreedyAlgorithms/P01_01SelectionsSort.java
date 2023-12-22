package L05SearchingSortingAndGreedyAlgorithms;

public class P01_01SelectionsSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 7, 1, -1, 5, 10, -22};

        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
