package lc_weekly_contest.biwc_86;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/minimum-impossible-or/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
class Solution03 {
    public int minImpossibleOR(int[] nums) {
        //hash表，数组去重，快速定位，
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i =1;i<Integer.MAX_VALUE;i <<=1){
            if(!set.contains(i)) return i;
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
