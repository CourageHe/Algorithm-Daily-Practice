import java.util.Arrays;

import javafx.scene.media.Track;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[] { l, r };
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return null;
    }
}
// @lc code=end
