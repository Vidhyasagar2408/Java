package ArrayProblems;

public class IfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        boolean ans = ifSorted(arr,n);
        System.out.println(ans);
    }
    public static boolean ifSorted(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
