/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                while (l < r && numbers[r - 1] == numbers[r]) r--;
                r--;
            } else if (sum < target) {
                while (l < r && numbers[l] == numbers[l + 1]) l++;
                l++;

            } else {
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

