package com.couragehe.offer03;

/**
 * @PackageName: com.couragehe.offer03
 * @ClassName: Solution02
 * @Description: 剑指 Offer 03. 数组中重复的数字 https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/10 23:55
 */

public class Solution02 {
    public int findRepeatNumber(int[] nums) {
        int [] arr = new int[nums.length];
        for(int i =0 ;i<nums.length;i++){
            if(arr[nums[i]] == 1)
                return nums[i];
            else
                arr[nums[i]]++;
        }
        return -1;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int ans = (new Solution01()).findRepeatNumber(nums);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
