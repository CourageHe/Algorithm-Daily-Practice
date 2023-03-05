package lc_weekly_contest.biwc_99;

/**
 * @Description: 第99场双周赛 6312. 最小和分割 https://leetcode.cn/problems/split-with-minimum-sum/
 * @Author: CourageHe
 * @Date: 2023/3/04 22:35
 */
public class Solution01_2 {
    public int splitNum(int num) {
        int[] nums = String.valueOf(num).chars().sorted().toArray();
        int num1 = 0,num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2== 0) num1 = num1*10+nums[i]-'0';
            else num2 = num2*10+nums[i]-'0';
        }
        return num1+num2;
    }

    public static void main(String[] args) {
        int ans = (new Solution01_2()).splitNum(10);
        System.out.println(ans);
    }
}
