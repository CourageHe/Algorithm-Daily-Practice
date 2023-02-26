/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        //记录路径
        char[][] paths = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(paths[i], '.');
        }
        //行数
        backtrace(paths, 0);
        return ans;
    }

    public void backtrace(char[][] paths, int row) {
        //结束条件
        if (row == paths.length) {
            //组合成字符串数组，加入返回列表
            List<String> sub = new ArrayList<>();
            for (int i = 0; i < paths.length; i++) {
                sub.add(String.valueOf(paths[i]));
            }
            ans.add(sub);
            return;
        }
        for (int i = 0; i < paths.length; i++) {
            //排除错误选择
            if (!isValid(paths, row, i)) continue;
            //做选择
            paths[row][i] = 'Q';
            backtrace(paths, row + 1);
            //撤销选择
            paths[row][i] = '.';
        }
    }

    public boolean isValid(char[][] paths, int row, int col) {
        //检查同列的上半部分是否有Q
        for (int i = 0; i < row; i++) {
            if (paths[i][col] == 'Q') return false;
        }
        //检查左向斜线是否有Q
        int i = row;
        int j = col;
        while (i > 0 && j > 0) {
            --i;
            --j;
            if (paths[i][j] == 'Q') return false;
        }
        //检查右向斜线是否有Q
        i = row;
        j = col;
        while (i > 0 && j < paths.length - 1) {
            --i;
            ++j;
            if (paths[i][j] == 'Q') return false;
        }
        return true;
    }
}
// @lc code=end

