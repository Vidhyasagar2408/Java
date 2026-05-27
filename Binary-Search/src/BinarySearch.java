import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        boolean sortResult = isSorted(arr);
        if (sortResult) {
            int index = binarySearch(arr, key);
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("key found at index " + index);
            }
        }
        else {
            System.out.println("Array is not sorted. Binary search is not possible");
        }
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}