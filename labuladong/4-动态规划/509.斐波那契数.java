/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    int[] memo = new int[31];
    public int fib(int n) {
        if(n < 2) return n;
        
        if(memo[n] == 0){
            memo[n] =fib(n-2)+ fib(n-1);
        }
        return memo[n];
        
    }
}
// @lc code=end

