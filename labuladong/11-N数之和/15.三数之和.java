import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length;i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum > 0) {
                    while (l < r && nums[r - 1] == nums[r]) r--;
                    r--;
                } else if (sum < 0) {
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    l++;

                } else {
                    List<Integer> subLists = new ArrayList<>();
                    subLists.add(nums[i]);
                    subLists.add(nums[l]);
                    subLists.add(nums[r]);
                    ans.add(subLists);

                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r - 1] == nums[r]) r--;
                    l++;
                    r--;
                }
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
                i++;
        }
        return ans;
    }

}
// @lc code=end
