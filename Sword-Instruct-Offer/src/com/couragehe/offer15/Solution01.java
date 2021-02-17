package com.couragehe.offer15;


/**
 * @PackageName: com.couragehe.offer15
 * @ClassName: Solution01
 * @Description: 剑指 Offer 15. 二进制中1的个数 https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/18 00:36
 */

public class Solution01 {
    public int hammingWeight(int n) {
        int ans = 0;
        int flag = 1;
        while(flag != 0){
            if((n & flag) != 0) ans++;
            System.out.println(n & flag);
            flag = flag << 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 00000000000000000000000000001011;
        int ans = (new Solution01()).hammingWeight(n);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
