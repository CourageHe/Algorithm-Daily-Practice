package lc_weekly_contest.biwc_99;

/**
 * @Description: 第99场双周赛 6311. 统计染色格子数 https://leetcode.cn/problems/count-total-number-of-colored-cells/
 * @Author: CourageHe
 * @Date: 2023/3/04 22:35
 */
public class Solution02 {

    public long coloredCells(int n) {
        return (long)2*n*n-2*n+1;
    }
    public static void main(String[] args) {
        long ans = (new Solution02()).coloredCells(2);
        System.out.println(ans);
    }
}
