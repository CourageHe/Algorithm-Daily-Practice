/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //s 由英文字母、数字、符号和空格组成
        int[] ascii = new int[256]; 
        char[] chars = s.toCharArray();
        int left = 0, right = 0,ans = 0;
        while(right<s.length()){
            //增大窗口
            ascii[chars[right]]++;
            right++;

            while(ascii[chars[right-1]] > 1){
                //存在重复,则缩小窗口
                ascii[chars[left]]--;
                left++;
            }
            ans = Math.max(ans,right-left);
        }
        return ans;
    }
}
// @lc code=end

