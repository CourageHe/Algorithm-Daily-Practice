package lc_weekly_contest.wc_328;

/**
 * @Description: 第328场周赛 01.数组元素和与数字和的绝对差 https://leetcode.cn/problems/difference-between-element-sum-and-digit-sum-of-an-array/
 * @Author: CourageHe
 * @Date: 2023/1/31 15:33
 */
public class Solution01 {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0;i<nums.length;i++){
            sum1+= nums[i];
            while(nums[i] !=0 ){
                sum2 += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(sum1-sum2);
    }
}
