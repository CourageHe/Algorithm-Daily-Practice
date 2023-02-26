/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    //元素无重不可复选-组合
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        LinkedList<Integer> tracks = new LinkedList<>();
        backtrace(tracks,k,n,1);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int k,int target,int start){
        if(tracks.size() > k || target < 0) return;
        if(tracks.size() == k && target ==0){
            ans.add(new ArrayList<Integer>(tracks));
        }
        for(int i = start;i<10;i++){
            tracks.add(i);
            backtrace(tracks,k,target-i,i+1);
            tracks.removeLast();
        }

    }
}
// @lc code=end

