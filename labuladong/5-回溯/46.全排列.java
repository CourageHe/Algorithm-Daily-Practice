/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        //记录路劲
        LinkedList<Integer> path = new LinkedList<Integer>();
        //记录路径中的元素标记为true，避免重复使用
        boolean[] used = new boolean[nums.length];
        backtrace(path,nums,used);
        return ans;
    }

    public void backtrace(LinkedList<Integer> path,int[] nums, boolean[] used) {
        //是否满足结束条件
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < used.length; i++) {
            if(!used[i]){
                //做选择
                used[i] = true;
                path.add(nums[i]);
                backtrace(path,nums,used);
                //撤销选择
                used[i] = false;
                path.removeLast();
            }
        }
    }

}
// @lc code=end

