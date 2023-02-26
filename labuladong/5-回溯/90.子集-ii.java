/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    //元素可重不可重复选择-子集
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        LinkedList<Integer> tracks = new LinkedList<>();
        Arrays.sort(nums);
        backtrace(tracks,nums,0);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int[]nums,int start){
        ans.add(new ArrayList<Integer>(tracks));

        for(int i = start;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tracks.add(nums[i]);
            backtrace(tracks,nums,i+1);
            tracks.removeLast();
        }
    }
}
// @lc code=end

