package com.couragehe.offer16;


/**
 * @PackageName: com.couragehe.offer16
 * @ClassName: Solution01
 * @Description: 剑指 Offer 16. 数值的整数次方  https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/19 00:29
 */

public class Solution01 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double x = 2.00000;
        int n = 10;
        double ans = (new Solution01()).myPow(x,n);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
