package lc_weekly_contest.wc_328;

/**
 * @Description: 第328场周赛 02.子矩阵元素加1的相关问题：
 *  303. 区域和检索 - 数组不可变(前缀和) https://leetcode.cn/problems/range-sum-query-immutable/
 * @Author: CourageHe
 * @Date: 2023/02/13 12:02
 */
public class Solution02_303 {
    class NumArray {

        int[] prefixSum;
        public NumArray(int[] nums) {
            prefixSum = new int[nums.length+1];
            for(int i =1;i<prefixSum.length;i++)
                prefixSum[i] = prefixSum[i-1]+nums[i-1];
        }

        public int sumRange(int left, int right) {
            return prefixSum[right+1]-prefixSum[left];
        }
    }
}
