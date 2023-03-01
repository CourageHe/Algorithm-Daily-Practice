/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new ArrayDeque<>();
        Set<String> visitedSet = new HashSet<>();
        for(String dead : deadends) visitedSet.add(dead);
        q.offer("0000");
        int times = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0;i < sz;i++){
                String temp = q.poll();
                if(temp.equals(target)) return times;
                //已经访问过的组合，可直接跳过，避免出现死循环
                if(visitedSet.contains(temp)) continue;
                visitedSet.add(temp);

                for(int j = 0;j<4;j++){
                    StringBuilder builder = new StringBuilder(temp);
                    int num = Integer.parseInt(temp.substring(j,j+1));

                    builder.deleteCharAt(j);
                    q.offer(builder.insert(j,(num+1)%10).toString());

                    builder.deleteCharAt(j);
                    q.offer(builder.insert(j,(num-1)<0?9:(num-1)).toString());
                }
            }
            times++;
        }
        return -1;
    }
}
// @lc code=end

