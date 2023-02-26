/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    //元素可重不可复选-排列
    List<List<Integer>> ans = new ArrayList<>();
    boolean[] used = null;
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> tracks = new LinkedList<>();
        used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrace(tracks,nums);

        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int[]nums){
        if(nums.length == tracks.size()){
            ans.add(new ArrayList<Integer>(tracks));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(used[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            //做选择
            used[i] = true;
            tracks.add(nums[i]);

            backtrace(tracks,nums);
            //撤销选择
            used[i] = false;
            tracks.removeLast();
        }
    }
}
// @lc code=end

