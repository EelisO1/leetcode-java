package leetcode;

import java.util.Arrays;

//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

//You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]


public class TwoSum {


    /**
     * Finds the sum of two numbers that add up to target
     * Time complexity is o(n^2)
     * TODO: an algorithm with a better time complexity
     * @param nums Array of numbers to be
     * @param target Number which sum is to be found
     * @return an array with the indices of the correct answer
     */
    public static int[] twoSum(int[] nums, int target) {
        int summa;
        int[] newNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                summa = nums[i] + nums[j];
                if (summa == target) {
                    newNums[0] = i;
                    newNums[1] = j;
                    return newNums;
                }
            }
        }
        System.out.println("No two sum solution");
        return newNums;
    }


    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, target);

        System.out.println("should print [0, 1]");
        System.out.println(Arrays.toString(result));
    }
}
