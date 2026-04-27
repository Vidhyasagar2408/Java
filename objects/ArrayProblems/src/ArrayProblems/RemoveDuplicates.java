package ArrayProblems;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = rd(arr);
        System.out.println("k: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//    Brute force technique
    public static int rd(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        int index = 0;
        for(int i: arr){
            if (!hash.contains(i)){
                hash.add(i);
                arr[index]=i;
                index++;
            }
        }
        return index;
    }
    //Optimal solution

}
