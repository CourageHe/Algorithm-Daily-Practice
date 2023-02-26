/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    //元素可重不可复选-组合
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        LinkedList<Integer> tracks = new LinkedList<>();
        Arrays.sort(candidates);
        backtrace(tracks,candidates,target,0);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int[] candidates, int target,int start){
        if(target == 0){
            ans.add(new ArrayList<Integer>(tracks));
        }
        if(target < 0) return;
        for(int i = start;i<candidates.length;i++){
            //相同的元素进行剪枝操作
            if(i>start && candidates[i] == candidates[i-1]) continue;

            tracks.add(candidates[i]);
            backtrace(tracks,candidates,target-candidates[i],i+1);
            tracks.removeLast();
        }
    }
}
// @lc code=end

