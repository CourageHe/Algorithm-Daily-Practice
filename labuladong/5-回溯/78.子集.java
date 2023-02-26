/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    //元素无重不可重选-子集
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> tracks = new LinkedList<>();
        backtrace(tracks,nums,0);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int[] nums,int start){
        ans.add(new ArrayList<>(tracks));
        for(int i = start;i<nums.length;i++){
            tracks.add(nums[i]);
            backtrace(tracks,nums,i+1);
            tracks.removeLast();
        }
    }

}
// @lc code=end

