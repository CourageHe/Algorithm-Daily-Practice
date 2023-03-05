package lc_weekly_contest.wc_335;

/**
 * @Description: 第329场周赛 6307. 递枕头 https://leetcode.cn/problems/pass-the-pillow/
 * @Author: CourageHe
 * @Date: 2023/3/5 10:35
 */
public class Solution01 {
    public int passThePillow(int n, int time) {
        int num =time % (2*(n-1));
        return num < n ? num+1 : (2*(n-1)-num) +1;
    }

    public static void main(String[] args) {
        // 9 4 4
        int ans = new Solution01().passThePillow(9,4);
        System.out.println(ans);
    }
}
