import java.util.Arrays;
import java.util.Scanner;

public class sortAndSearchKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        boolean sortResult = isSorted(arr);
        if (sortResult) {
            int index = binarySearch(arr, key);
            if (index == -1){
                System.out.println("Key not found");
            } else {
                System.out.println("key found at index: " + index);
            }
        } else {
            System.out.println("Array is not sorted. We need to first sort the array and then find the key.");
            System.out.println("Sorting the Array...");
            bubbleSort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            int index = binarySearch(arr, key);
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index: " + index);
            }
        }
    }
    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key == arr[mid]){
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
