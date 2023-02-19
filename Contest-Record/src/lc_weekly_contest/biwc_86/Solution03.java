package lc_weekly_contest.biwc_86;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/minimum-impossible-or/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
public class Solution03 {
    public int minImpossibleOR(int[] nums) {
        for(int i =1;i<Integer.MAX_VALUE;i <<=1){
            boolean flag = false;
            for (int m = 0; m < nums.length; m++) {
                if (i == nums[m]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] nums = new int[]{5,3,2};
        int[] nums = new int[]{2,1};
        int ans = (new Solution03()).minImpossibleOR(nums);
        System.out.println(ans);
        // System.out.println(1<<2);
    }
}
