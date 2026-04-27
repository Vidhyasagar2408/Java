package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 4, 3, 9};

        InsertionSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertionSort(int[] arr , int n){
        for (int i = 0; i <= n-1 ; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
