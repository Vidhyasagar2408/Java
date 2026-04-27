package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {7, 4, 1, 4, 3, 9};

        BubbleSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int[] arr , int n){
        for (int i = n-1; i > 1 ; i--) {
            int didSwap = 0;
            for (int j = 0; j < i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }
    }

}