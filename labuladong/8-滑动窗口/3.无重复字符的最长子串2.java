/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int left = 0, right = 0,ans = 0;
        while(right<s.length()){
            if(!set.contains(chars[right])) {
                set.add(chars[right]);
                right++;
            }else{
                set.remove(chars[left]); 
                left++;
            } 
            ans = Math.max(ans,right-left);
        }
        return ans;
    }
}
// @lc code=end

