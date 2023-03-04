package com.pattern.two.pointers;

import java.util.Arrays;

/**
 * Note: Need to determine if the array contains three pairs that can be summed to a target or not
 */
public class SumOfThreeValues
{
    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);
        for(int count=0; count < nums.length - 1; count++) {
            int current = nums[count];
            int left = count + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = current + nums[left] + nums[right];
                if(sum == target)
                    return true;
                else if (sum < target)
                    left = left + 1;
                else
                    right = right - 1;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(SumOfThreeValues.findSumOfThree(new int[]{1, -1, 0}, -1));
        System.out.println(SumOfThreeValues.findSumOfThree(new int[]{1, -1, 0}, 0));

    }
}


