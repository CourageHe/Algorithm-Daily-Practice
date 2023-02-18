/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0,r= 0;
        while(r<nums.length){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l]= nums[r];
                nums[r]=temp;
                l++;
            }
            r++;
        }
    }
}
// @lc code=end

