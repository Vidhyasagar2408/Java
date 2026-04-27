package ArrayProblems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotate(arr)));
        System.out.println(Arrays.toString(rotateByMany(arr2, 3, "right")));
    }
    //rotate by only one place
    public static int[] rotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    //rotate by k places
    public static int[] rotateByMany(int[] arr, int d, String direction){
        int n = arr.length;
        d=d%n;
        if (direction.equals("right")){
            reverseArray(arr, 0, n-1);
            reverseArray(arr, 0, d-1);
            reverseArray(arr, d, n-1);
        } else if (direction.equals("left")) {
            reverseArray(arr, 0, d-1);
            reverseArray(arr, d, n-1);
            reverseArray(arr ,0, n-1);
        }
        return arr;
    }
    public static void reverseArray(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
