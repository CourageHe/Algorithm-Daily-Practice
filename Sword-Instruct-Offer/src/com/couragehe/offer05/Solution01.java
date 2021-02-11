package com.couragehe.offer05;

import javax.swing.tree.TreeNode;

/**
 * @PackageName: com.couragehe.offer05
 * @ClassName: Solution01
 * @Description: 剑指 Offer 05. 替换空格  https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/11 0:00
 */

public class Solution01 {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (String.valueOf(ch).equals(" ")) {
                builder.append("%20");
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String s = "We are happy.";
        String ans = (new Solution01()).replaceSpace(s);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
