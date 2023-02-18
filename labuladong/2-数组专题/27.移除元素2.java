/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0,r = nums.length-1;
        while(l<=r){
            if(nums[l] == val){
                nums[l] = nums[r--];
            }else{
                l++;
            }
        }
        return l;
    }
}
// @lc code=end

