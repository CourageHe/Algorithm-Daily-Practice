/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1;
        while(r<nums.length){
            if(nums[l] != nums[r]) {
                nums[++l] = nums[r];
            }
            r++;

        }
        return l+1;
    }
}
// @lc code=end

