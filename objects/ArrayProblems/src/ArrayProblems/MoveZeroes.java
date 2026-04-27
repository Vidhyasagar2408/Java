package ArrayProblems;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int left = 0;
        int[] nums = {0,1,0,3,12};
        for(int right = 0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
