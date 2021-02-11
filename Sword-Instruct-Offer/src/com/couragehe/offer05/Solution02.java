package com.couragehe.offer05;

/**
 * @PackageName: com.couragehe.offer05
 * @ClassName: Solution01
 * @Description: 剑指 Offer 05. 替换空格  https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/11 0:00
 */

public class Solution02 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) return s;
        char[] arr = s.toCharArray();//数组化
        int numOfBlank = 0;
        for (char c : arr)
            if (c == ' ') numOfBlank++;
        //数组扩容
        char[] arrNew = new char[arr.length + numOfBlank * 2];
        for (int i = 0; i < arr.length; i++)
            arrNew[i] = arr[i];
        int p1 = arr.length - 1;//指向原始字符串的末尾
        int p2 = arrNew.length - 1;//指向替换之后的字符串的末尾
        for (; p1 != p2; ) {
            if (arrNew[p1] != ' ') {
                arrNew[p2--] = arrNew[p1--];//
            } else {
                p1--;
                arrNew[p2--] = '0';
                arrNew[p2--] = '2';
                arrNew[p2--] = '%';
            }
        }
        return String.valueOf(arrNew);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String s = "We are happy.";
        String ans = (new Solution02()).replaceSpace(s);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
