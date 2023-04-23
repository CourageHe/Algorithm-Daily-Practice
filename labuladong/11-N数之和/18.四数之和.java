import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {

  
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> res = threeSum(nums, target - nums[i], i + 1);
            for (List<Integer> list : res) {
                list.add(nums[i]);
                ans.add(list);
            }
            while (i<nums.length-1 && nums[i] == nums[i+1]) i++;
        }
//        for (List<Integer> list : ans) {
//            Collections.sort(list);
//        }
        return ans;
    }

    public List<List<Integer>> threeSum(int[] nums, long target, int start) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = start; i < nums.length; i++) {
            List<List<Integer>> res = twoSum(nums, target - nums[i], i + 1);
            for (List<Integer> list : res) {
                list.add(nums[i]);
                ans.add(list);
            }
            while (i<nums.length-1 && nums[i] == nums[i+1]) i++;
        }
        return ans;
    }

    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> ans = new ArrayList<>();
        int l = start, r = nums.length - 1;
        while (l < r) {
            int left = nums[l], right = nums[r];
            long sum = left + right;
            if (sum > target) {
                while (l < r && right == nums[r]) r--;
            } else if (sum < target) {
                while (l < r && left == nums[l]) l++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(nums[l]);
                list.add(nums[r]);
                ans.add(list);
                while (l < r && left == nums[l]) l++;
                while (l < r && right == nums[r]) r--;
            }
        }
        return ans;
    }
}
// @lc code=end

