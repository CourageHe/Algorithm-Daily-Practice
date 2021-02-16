package com.couragehe.offer10;


/**
 * @PackageName: com.couragehe.offer10
 * @ClassName: SolutionII01
 * @Description: 剑指 Offer 10- II. 青蛙跳台阶问题  https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/16 23:32
 */

public class SolutionII01 {
    //每一阶都有两种跳法，跳两阶或者跳一阶
    //类似斐波那契数列数列，f(n) = f(n-1) + f(n-2);//只是相比起始数字不同
    public int numWays(int n) {
        if(n ==0 || n ==1) return 1;
        if(n ==2) return 2;
        int a = 2;int b = 1;//a  第n-1个元素，b 第n-2个元素
        for(int i=3;i<=n;i++){
            a = a + b;
            b = a - b;
            a%=1000000007;//取模运算解决越界问题
        }
        return a;
    }
}
