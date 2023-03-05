package lc_weekly_contest.biwc_99;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @Description: 第99场双周赛 6313. 统计将重叠区间合并成组的方案数 https://leetcode.cn/problems/count-ways-to-group-overlapping-ranges/
 * @Author: CourageHe
 * @Date: 2023/3/04 23:05
 */
public class Solution03 {
    public static int mod = 1000000007;//模数
    public int countWays(int[][] ranges) {
        //根据第一位的值从小到大排序
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        int count = 0;
        for (int i = 0, j = -1; i < ranges.length; j = Math.max(j, ranges[i++][1])) {
            if (j < ranges[i][0]) count++;
        }

        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i <= count / 2; i++) {
            BigInteger temp = BigInteger.ONE;
            int num = count;
            for (int j = 1; j <= i; j++, num--) {
                temp = temp.multiply(BigInteger.valueOf(num)).divide(BigInteger.valueOf(j));
            }
            if (i == count / 2 && count % 2 == 0) {
                ans = (ans.add(temp)).divideAndRemainder(BigInteger.valueOf(mod))[1];
            } else {
                ans = (ans.add(temp.multiply(BigInteger.valueOf(2)))).divideAndRemainder(BigInteger.valueOf(mod))[1];
            }
        }
        return ans.intValue();
    }

    public static void main(String[] args) {
        // int[][] ranges = {{1,3},{10,20},{2,5},{4,8}};
        // int[][] ranges = {{6,10},{5,15}};
        // int[][] ranges = {{34,56},{28,29},{12,16},{11,48},{28,54},{22,55},{28,41},{41,44}};
        // int[][] ranges = {{10,11},{25,28},{29,34},{49,51},{58,66},{77,84},{91,91},{100,104},{120,121},{127,128},{151,151},{156,168},{0,8}};
        int[][] ranges = {{57, 92}, {139, 210}, {306, 345}, {411, 442}, {533, 589}, {672, 676}, {801, 831}, {937, 940}, {996, 1052}, {1113, 1156}, {1214, 1258}, {1440, 1441}, {1507, 1529}, {1613, 1659}, {1773, 1814}, {1826, 1859}, {2002, 2019}, {2117, 2173}, {2223, 2296}, {2335, 2348}, {2429, 2532}, {2640, 2644}, {2669, 2676}, {2786, 2885}, {2923, 2942}, {3035, 3102}, {3177, 3249}, {3310, 3339}, {3450, 3454}, {3587, 3620}, {3725, 3744}, {3847, 3858}, {3901, 3993}, {4100, 4112}, {4206, 4217}, {4250, 4289}, {4374, 4446}, {4510, 4591}, {4675, 4706}, {4732, 4768}, {4905, 4906}, {5005, 5073}, {5133, 5142}, {5245, 5309}, {5352, 5377}, {5460, 5517}, {5569, 5602}, {5740, 5791}, {5823, 5888}, {6036, 6042}, {6096, 6114}, {6217, 6262}, {6374, 6394}, {6420, 6511}, {6564, 6587}, {6742, 6743}, {6797, 6877}, {6909, 6985}, {7042, 7117}, {7141, 7144}, {7276, 7323}, {7400, 7456}, {7505, 7557}, {7690, 7720}, {7787, 7800}, {7870, 7880}, {8013, 8031}, {8114, 8224}, {8272, 8328}, {8418, 8435}, {8493, 8537}, {8600, 8704}, {8766, 8812}, {8839, 8853}, {9032, 9036}, {9108, 9189}, {9222, 9291}, {9344, 9361}, {9448, 9502}, {9615, 9673}, {9690, 9800}, {9837, 9868}, {85, 96}, {145, 202}, {254, 304}, {372, 411}, {534, 551}, {629, 692}, {727, 787}, {861, 944}, {1041, 1084}, {1133, 1174}, {1260, 1307}, {1339, 1358}, {1478, 1548}, {1580, 1618}, {1694, 1814}, {1848, 1891}, {1936, 1990}, {2058, 2130}};
        long ans = (new Solution03()).countWays(ranges);
        System.out.println(ans);

        // int i = 0;
        // int num1 = 1,num2= 1,num3 = 1;
        // for (int j = 1; j <=i; j++) {
        //     num1 *= num3;
        //     num3--;
        // }
        // for (int k = 1; k <= i; k++) {
        //     num2 *=k;
        // }
        // System.out.println(num1);
        // System.out.println(num2);
    }
}
