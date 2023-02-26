/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i =1;i<dp.length;i++){
            for (int j = 0; j < coins.length; j++) {
                if(i-coins[j] < 0 || dp[i-coins[j]] < 0) continue; 
                dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1:dp[amount];
    }
}
// @lc code=end

