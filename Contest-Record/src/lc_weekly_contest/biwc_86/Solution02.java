package lc_weekly_contest.biwc_86;

import java.util.Arrays;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/minimum-score-by-changing-two-elements/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
class Solution02 {
    public int minimizeSum(int[] nums) {
        if(nums.length == 3) return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int max1 =nums[len-2] - nums[1];

        int max2= nums[len-1]-nums[2];
        int max3= nums[len-3]-nums[0];
        int max = Math.min(Math.min(max1,max2),max3);
        return max;
    }
    public static void main(String[] args) {
        // int[] nums = new int[]{1,4,7,8,5};
        int[] nums = new int[]{1,4,3};
        // int[] nums = new int[]{31,25,72,79,74,65};//14
        int ans = (new Solution02()).minimizeSum(nums);
        System.out.println(ans);
    }
}
