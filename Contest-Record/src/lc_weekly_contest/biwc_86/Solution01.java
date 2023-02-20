package lc_weekly_contest.biwc_86;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/maximum-difference-by-remapping-a-digit/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
class Solution01 {
    //暴力枚举
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<10;i++){
            //获取最大值
            int digitMax = Integer.parseInt(s.replace((char)i,'9'));
            max = max>digitMax?max:digitMax;
            //获取最小值
            int digitMin = Integer.parseInt(s.replace((char)i,'0'));
            min = min<digitMin?min:digitMin;
        }
        return max-min;
    }
    public static void main(String[] args) {
        int num = 90;
        int ans = (new Solution01()).minMaxDifference(num);
        System.out.println(ans);
    }
}
