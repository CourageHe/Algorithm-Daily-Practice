/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        //左边第一个关键数的位置
        int left = 0,right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]< target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] == target){
                right = mid-1;
            }
        }
        if(left == nums.length){
            ans[0] = -1;
        } else {
            ans[0] = nums[left] == target?left:-1;
        }
        //右边第一个关键数的位置

        left = 0;right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]< target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] == target){
                left = mid+1;
            }
        }
        if(left-1<0){
            ans[1] = -1;
        } else {
            ans[1] = nums[left-1] == target?(left-1):-1;
        }
        return ans;
    }
}
// @lc code=end

