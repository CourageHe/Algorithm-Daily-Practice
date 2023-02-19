package lc_weekly_contest.biwc_86;

/**
 * @Description: https://leetcode.cn/contest/biweekly-contest-98/problems/handling-sum-queries-after-update/
 * @Author: CourageHe
 * @Date: 2023/02/18 22:34
 */
public class Solution04 {
    public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        //计算返回数组长度
        int ansLen = 0;
        for (int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 3) ansLen++;
        }
        long[] ans = new long[ansLen];
        //nums2切换成long类型，避免溢出
        long[] nums2L = new long[nums2.length];
        for (int i = 0; i < nums2L.length; i++) {
            nums2L[i] = nums2[i];
        }
        int count = 0;
        //按题目要求
        for (int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 1){
                int l = queries[i][1];
                int r = queries[i][2];
                while(l<=r){
                    nums1[l] = nums1[l]== 0?1:0;
                    l++;
                }
            }else if (queries[i][0] == 2){
                int p = queries[i][1];
                for (int j = 0; j < nums1.length; j++) {
                    nums2L[j] = nums2L[j]+nums1[j]*p;
                }
            }else {
                long sum = 0;
                for (int m = 0; m < nums2L.length; m++) {
                    sum+=nums2L[m];
                }
                ans[count++] =sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] nums = new int[]{5,3,2};
        int[] nums1 = new int[]{1,0,1};
        int[] nums2 = new int[]{0,0,0};
        int[][] queries = new int[][]{{1,1,1},{2,1,0},{3,0,0}};


        // int[] nums1 = new int[]{1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0};
        // int[] nums2 = new int[]{48,2,32,25,30,37,32,18,48,39,34,19,46,43,30,22,20,35,28,3,5,45,39,21,46,45,12,15};
        // int[][] queries = new int[][]{{3,0,0},{2,3,0},{1,10,26},{2,4,0},{2,18,0}}; //819

        long[] ans = (new Solution04()).handleQuery(nums1,nums2,queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        // System.out.println(1<<2);
    }
}
