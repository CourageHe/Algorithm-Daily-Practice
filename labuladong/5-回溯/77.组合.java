/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    //元素无重不可复选-组合
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> tracks = new LinkedList<>();
        backtrace(tracks,n,k,1);
        return ans;
    }
    public void backtrace(LinkedList<Integer> tracks,int n, int k,int start){
        if(tracks.size() > k) return;
        if(tracks.size() == k){
            ans.add(new ArrayList<Integer>(tracks));
            return;
        }
        for(int i = start;i<=n;i++){
            tracks.add(i);
            backtrace(tracks,n,k,i+1);
            tracks.removeLast();
        }
    }
}
// @lc code=end

