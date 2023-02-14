package lc_weekly_contest.wc_328;

/**
 * @Description: 第328场周赛 02.子矩阵元素加1的相关问题：
 *  304. 二维区域和检索 - 矩阵不可变(二维前缀和) https://leetcode.cn/problems/range-sum-query-2d-immutable/
 * @Author: CourageHe
 * @Date: 2023/02/13 12:02
 */
public class Solution02_304 {
    static class NumMatrix {
        int[][] matrixSum;
        public NumMatrix(int[][] matrix) {
            matrixSum = new int[matrix.length][matrix[0].length];
            for(int i = matrix.length-1;i>=0;i--){
                for(int j = matrix[0].length-1;j>=0;j--){
                    if(i== matrix.length-1 && j==matrix[0].length-1) matrixSum[i][j] =  matrix[i][j];
                    else{
                        int sum = 0;
                        sum += matrix[i][j];
                        if(i+1 <matrixSum.length) sum += matrixSum[i+1][j];
                        if(j+1 <matrixSum[0].length) sum += matrixSum[i][j+1];
                        if(i+1 <matrixSum.length && j+1 <matrixSum[0].length)
                            sum-=matrixSum[i+1][j+1];
                        matrixSum[i][j] = sum;
                    }
                }
            }
        }
        public int sumRegion(int row1, int col1, int row2, int col2) {
            int ans = 0;
            ans += matrixSum[row1][col1];
            if(row2+1 <matrixSum.length) ans -= matrixSum[row2+1][col1];
            if(col2+1 <matrixSum[0].length) ans -= matrixSum[row1][col2+1];
            if(row2+1 <matrixSum.length && col2+1 <matrixSum[0].length)
                ans += matrixSum[row2+1][col2+1];
            return ans;
        }
    }

    public static void main(String[] args) {
        int [][] matrix = new  int[][]{{-4,-5}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        int sumre = numMatrix.sumRegion(0,0,0,0);
        System.out.println(sumre);
    }
}
