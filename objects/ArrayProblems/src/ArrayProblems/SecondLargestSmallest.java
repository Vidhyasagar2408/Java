package ArrayProblems;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        slargest(arr,n);
        ssmallest(arr,n);
    }
    public static void slargest(int[] arr, int n){
        if (n<2){
            return;
        }
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
    public static void ssmallest(int[] arr, int n){
        if (n<2){
            return;
        }
        int smallest = arr[0];
        int ssmalest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
                ssmalest = smallest;
            } else if (arr[i] > smallest && arr[i] < ssmalest) {
                ssmalest = arr[i];
            }
        }
        System.out.println(ssmalest);
    }
}