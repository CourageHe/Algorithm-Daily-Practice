package lc_weekly_contest.wc_328;

/**
 * @Description: 第328场周赛 02.子矩阵元素加1的相关问题：
 *  304. 二维区域和检索 - 矩阵不可变(二维前缀和-增加空间简化代码) https://leetcode.cn/problems/range-sum-query-2d-immutable/
 * @Author: CourageHe
 * @Date: 2023/02/13 12:02
 */
public class Solution02_304_2 {
    static class NumMatrix {
        int[][] matrixSum;
        public NumMatrix(int[][] matrix) {
            matrixSum = new int[matrix.length+1][matrix[0].length+1];
            for(int i = matrix.length-1;i>=0;i--){
                for(int j = matrix[0].length-1;j>=0;j--){
                    matrixSum[i][j] =  matrix[i][j] + matrixSum[i+1][j]+matrixSum[i][j+1]-matrixSum[i+1][j+1];
                }
            }
        }
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return  matrixSum[row1][col1]-matrixSum[row2+1][col1]-matrixSum[row1][col2+1]+matrixSum[row2+1][col2+1];
        }
    }

    public static void main(String[] args) {
        int [][] matrix = new  int[][]{{-4,-5}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        int sumre = numMatrix.sumRegion(0,0,0,0);
        System.out.println(sumre);
    }
}
