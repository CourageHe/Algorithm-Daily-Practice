package lc_weekly_contest.wc_333;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/
 * @Author: CourageHe
 * @Date: 2023/02/19 10:05
 */
class Solution01 {
    //归并排序
    public int[][]  mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i = 0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]+ nums2[j][1]});
                i++;
                j++;
            }else if (nums1[i][0] < nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }else{
                list.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<nums1.length){
            list.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<nums2.length){
            list.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] nums1 = new int[][] {{1,2},{2,3},{4,5}};
        int[][] nums2 = new int[][]{{1,4},{3,2},{4,1}};

        // int[][] nums1 = new int[][]         {{148,597},{165,623},{306,359},{349,566},{403,646},{420,381},{566,543},{730,209},{757,875},{788,208},{932,695}};
        // int[][] nums2 = new int[][]{{74,669},{87,399},{89,165},{99,749},{122,401},{138,16},{144,714},{148,206},{177,948},{211,653},{285,775},{309,289},{349,396},{386,831},{403,318},{405,119},{420,153},{468,433},{504,101},{566,128},{603,688},{618,628},{622,586},{641,46},{653,922},{672,772},{691,823},{693,900},{756,878},{757,952},{770,795},{806,118},{813,88},{919,501},{935,253},{982,385}};

        // int[][] nums1 = new int[][]     {{148,597},{165,623},{306,359},{349,566},{403,646},{420,381},{566,543},{730,209},{757,875},{788,208},{932,695}};
        // int[][] nums2 = new int[][]{{74,669},{87,399},{89,165},{99,749},{122,401},{138,16},{144,714},{148,206},{177,948},{211,653},{285,775},{309,289},{349,396},{386,831},{403,318},{405,119},{420,153},{468,433},{504,101},{566,128},{603,688},{618,628},{622,586},{641,46},{653,922},{672,772},{691,823},{693,900},{756,878},{757,952},{770,795},{806,118},{813,88},{919,501},{935,253},{982,385}};

        int[][] ans = (new Solution01()).mergeArrays(nums1,nums2);
        System.out.println(ans);
    }
}
