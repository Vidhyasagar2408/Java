package ArrayProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3};
        System.out.println(LS(arr,4));
    }
    public static int LS(int[] arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
