package ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
//        System.out.println(Single(arr));
        System.out.println(singleByXOR(arr));
    }
    // using hashset
//    public static int Single(int[] arr){
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (set.contains(arr[i])){
//                set.remove(arr[i]);
//            }
//            else {
//                set.add(arr[i]);
//            }
//        }
//        return set.iterator().next();
//    }
    // using XOR
    public static int singleByXOR(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ i;
        }
        return xor;
    }
}
