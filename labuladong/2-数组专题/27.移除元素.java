/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0,r = 0;
        while(l<nums.length){
            if(nums[l] == val) break;
            l++;
        }
        r = l+1;
        while(r<nums.length){
            if(nums[r] != val) break;
            r++;
        }
        while(r<nums.length){
            if(nums[r] != val){
                nums[l++] = nums[r];
            }
            r++;
        }
        return l;
    }
}
// @lc code=end

