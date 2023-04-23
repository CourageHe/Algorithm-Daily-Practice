/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(rob2(Arrays.copyOfRange(nums,0,nums.length-1)),rob2(Arrays.copyOfRange(nums,1,nums.length)));
    }
    public int rob2(int[] nums) {
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

