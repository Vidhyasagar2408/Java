package com.vidhya;

public class MaxReverse {
    public static void main(String[] args) {
        int[]  arr = {99,2,5,7,9,3};
        System.out.println(max(arr));
        System.out.println(maxRange(arr , 2 , 5));

    }
    static int max(int arr[] ){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int maxRange(int arr[] , int start, int end){
        int max = arr[start];
        for (int i = start; i < end ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
