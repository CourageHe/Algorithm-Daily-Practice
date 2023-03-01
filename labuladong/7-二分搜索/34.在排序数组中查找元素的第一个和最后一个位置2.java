/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]< target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] == target){
                int p1 = mid,p2 = mid;
                //寻左
                while(p1 > 0 && nums[p1-1] == target)
                    p1--;
                while(p2 < nums.length-1 && nums[p2+1] == target)
                    p2++;
                return new int[]{p1,p2};
            }
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

