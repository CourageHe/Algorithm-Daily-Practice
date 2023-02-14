package lc_weekly_contest.wc_328;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 2537. 统计好子数组的数目 https://leetcode.cn/problems/count-the-number-of-good-subarrays/
 * @Author: CourageHe
 * @Date: 2023/02/14 14:42
 */
public class Solution03_2 {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int pairs = 0;
        int left = 0;
        long ans = 0;
        //右指针
        for(int num : nums){
            pairs += map.getOrDefault(num,0);
            map.merge(num,1,Integer::sum);//合并
            ans += left;
            //缩小左指针
            while(pairs>=k){
                pairs -= map.merge(nums[left++],-1,Integer::sum);//合并
                ans++;
            }
        }
        return ans;
    }
}
