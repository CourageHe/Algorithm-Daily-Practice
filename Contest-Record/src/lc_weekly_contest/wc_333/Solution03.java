package lc_weekly_contest.wc_333;

/**
 * @Description: https://leetcode.cn/problems/count-the-number-of-square-free-subsets/
 * @Author: CourageHe
 * @Date: 2023/02/19 10:05
 */
class Solution03 {
    //1、01背包的做法
    public int squareFreeSubsets(int[] nums) {
        int ans = 0;

        return ans;
    }

    //2、状压的做法
    public static void main(String[] args) {
        int[] nums = {3,4,4,5};
        int ans = (new Solution03()).squareFreeSubsets(nums);
        System.out.println(ans);
    }
}
