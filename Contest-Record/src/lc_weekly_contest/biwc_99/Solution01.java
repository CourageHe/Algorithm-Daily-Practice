package lc_weekly_contest.biwc_99;

/**
 * @Description: 第99场双周赛 6312. 最小和分割 https://leetcode.cn/problems/split-with-minimum-sum/
 * @Author: CourageHe
 * @Date: 2023/3/04 22:35
 */
public class Solution01 {
    public int splitNum(int num) {
        //统计各数字数量
        int[] nums = new int[10];
        int helper = num;
        while (helper >= 10) {
            nums[helper % 10]++;
            helper = helper / 10;
        }
        nums[helper % 10]++;
        //这里初始化0，以防Integer.valueOf传参为空字符串报错。
        StringBuilder builder1 = new StringBuilder("0");
        StringBuilder builder2 = new StringBuilder("0");
        for (int i = 1; i < nums.length;) {
            if (nums[i] == 0) {
                //i 对应的数量为0，分配下一个是数字
                i++;
                continue;
            } else if (builder1.length() < builder2.length()) {
                builder1.append(i);
            } else {
                builder2.append(i);
            }
            //数量减-1
            nums[i]--;
        }
        return Integer.valueOf(builder1.toString())+Integer.valueOf(builder2.toString());
    }

    public static void main(String[] args) {
        int ans = (new Solution01()).splitNum(10);
        System.out.println(ans);
    }
}
