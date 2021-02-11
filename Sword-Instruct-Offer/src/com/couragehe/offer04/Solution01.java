package com.couragehe.offer04;

import javax.swing.tree.TreeNode;

/**
 * @PackageName: com.couragehe.offer03.offer04
 * @ClassName: Solution01
 * @Description: 剑指 Offer 04. 二维数组中的查找 https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/11 0:05
 */

public class Solution01 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;//矩阵为空则直接返回false
        int n = matrix.length;//计算n
        int m = matrix[0].length;//计算m
        int i = 0, j = m - 1;//从矩阵右上角开始排查
        for (; i < n && j >= 0; ) {
            if (matrix[i][j] == target)//等于则返回为true
                return true;
            else if (matrix[i][j] > target)//大于则比较元素为同行前一个
                j--;
            else//小于则比较元素为同列下一个
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean ans = (new Solution01()).findNumberIn2DArray(matrix, target);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
