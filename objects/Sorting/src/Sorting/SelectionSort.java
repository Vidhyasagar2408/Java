package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {7, 4, 1, 4, 3, 9};

        selectionSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 2; i++) {

            int min = i;

            for (int j = i; j < n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}