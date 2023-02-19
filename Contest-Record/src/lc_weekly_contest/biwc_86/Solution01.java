package lc_weekly_contest.biwc_86;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/maximum-difference-by-remapping-a-digit/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
public class Solution01 {
    public int minMaxDifference(int num) {
        int ans = 1;
        String numStr = num+"";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<10;i++){
            String temp = numStr.replace(i+"",9+"");
            int digit = Integer.parseInt(temp);
            max = max>digit?max:digit;
        }
        //最小

        for(int i = 0;i<10;i++){
            String temp = numStr.replace(i+"",0+"");
            int digit = Integer.parseInt(temp);
            min = min<digit?min:digit;
        }
        return max-min;
    }
    public static void main(String[] args) {
        int num = 90;
        int ans = (new Solution01()).minMaxDifference(num);
        System.out.println(ans);
    }
}
