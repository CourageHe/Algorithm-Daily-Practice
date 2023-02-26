/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    //元素无重可复选-组合
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> tracks = new LinkedList<>();
        backtrace(tracks,candidates,target,0);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int[] candidates, int target,int start){
        //结束条件
        if(target == 0){
            ans.add(new ArrayList<Integer>(tracks));
        }
        if(target < 0) return;
        
        for(int i = start;i<candidates.length;i++){
            //做选择
            tracks.add(candidates[i]);
            backtrace(tracks,candidates,target-candidates[i],i);
            //撤销选择
            tracks.removeLast();
        }
    } 
}
// @lc code=end

