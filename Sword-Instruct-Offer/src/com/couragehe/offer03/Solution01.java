package com.couragehe.offer03;

import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName: com.couragehe.offer03
 * @ClassName: Solution01
 * @Description: 剑指 Offer 03. 数组中重复的数字 https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/10 23:54
 */

public class Solution01 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return 0;
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
