package com.couragehe.offer10;


/**
 * @PackageName: com.couragehe.offer10
 * @ClassName: Solution01
 * @Description: 剑指 Offer 10- I. 斐波那契数列  https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/16 23:32
 */

public class SolutionI01 {
    public int fib(int n) {
        if(n ==0 || n ==1) return n;
        int a = 1;int b = 0;//a  第n-1个元素，b 第n-2个元素
        for(int i=2;i<=n;i++){
            a = a + b;
            b = a - b;
            a%=1000000007;
        }
        return a;
    }
}
