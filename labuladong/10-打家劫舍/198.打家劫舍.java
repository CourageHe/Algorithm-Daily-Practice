/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int[]dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //base case
            if(i == 0) {
                dp[i] = nums[i];
                continue;
            }
            if(i == 1) {
                dp[i] = Math.max(nums[i],dp[i-1]);
                continue;
            }
            dp[i]= Math.max(dp[i-2]+nums[i],dp[i-1]);//状态转换方程
        }
        return dp[dp.length-1];
    }
}
// @lc code=end

