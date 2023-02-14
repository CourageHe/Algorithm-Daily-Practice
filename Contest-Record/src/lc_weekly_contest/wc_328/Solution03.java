package lc_weekly_contest.wc_328;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: CourageHe
 * @Date: 2023/02/14 16:20
 */
public class Solution03 {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        int pairs =0,left = 0;
        for(int num : nums){
            pairs += map.getOrDefault(num,0);
            map.merge(num,1,Integer::sum);
            while(pairs-map.get(nums[left])+1>=k){
                pairs -= map.merge(nums[left++],-1,Integer::sum);
            }
            if(pairs>=k) ans+=left+1;
        }
        return ans;
    }
}