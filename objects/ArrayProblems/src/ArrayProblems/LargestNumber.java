package ArrayProblems;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,2,6,7};
        largest(arr,5);
    }

    public static void largest(int[] arr,int n){
        int largest = arr[0];
        for (int i = 0; i <= n-1 ; i++) {
            if (arr[i]>largest) largest=arr[i];
        }
        System.out.println(largest);
    }
}

