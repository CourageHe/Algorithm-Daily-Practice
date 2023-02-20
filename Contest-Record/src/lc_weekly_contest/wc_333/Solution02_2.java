package lc_weekly_contest.wc_333;

/**
 * @Description: https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/
 * @Author: CourageHe
 * @Date: 2023/02/19 10:05
 */
class Solution02_2 {
    int[] arr = new int[100000];
    //记忆化搜索
    //回溯，枚举是+2^k,还是-2^k
    public int dfs (int n){
        if((n & n-1) == 0) return 1;//2的幂次方
        int lowbit = n & -n;
        if(arr[lowbit] == 0){
            arr[lowbit] = Math.min(dfs(n+lowbit),dfs(n-lowbit))+1;
        }
        return arr[lowbit];
    }
    public int minOperations(int n) {
        return dfs(n);
    }
    public static void main(String[] args) {
        // int n = 39;//3
        // int n = 38;//3
        // int n = 54;//3
        int n = 27;//3
        // int n = 15;//2
        int ans = (new Solution02_2()).minOperations(n);
        System.out.println(ans);
    }
}
