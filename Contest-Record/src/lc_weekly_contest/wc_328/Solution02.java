package lc_weekly_contest.wc_328;

/**
 * @Description: 第328场周赛 02.子矩阵元素加 1 https://leetcode.cn/problems/increment-submatrices-by-one/
 * 参考题解：https://leetcode.cn/problems/increment-submatrices-by-one/solution/er-wei-cha-fen-tu-jie-by-newhar-4tch/
 * @Author: CourageHe
 * @Date: 2023/2/1 13:33
 */
public class Solution02 {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n+1][n+1];
        for(int i = 0;i<queries.length;i++){
            diff[queries[i][0]][queries[i][1]]++;
            diff[queries[i][0]][queries[i][3]+1]--;
            diff[queries[i][2]+1][queries[i][1]]--;
            diff[queries[i][2]+1][queries[i][3]+1]++;
        }
        for(int i=0;i<n;i++)
            for(int j=1;j<n;j++) diff[i][j]+=diff[i][j-1];
        for(int i=1;i<n;i++)
            for(int j=0;j<n;j++) diff[i][j]+=diff[i-1][j];

        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) ans[i][j] = diff[i][j];
        return ans;
    }
}
