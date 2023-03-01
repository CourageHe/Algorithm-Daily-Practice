/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] chars_1 = new int[26];
        int[] chars_2 = new int[26];
        for(char c : s1.toCharArray()) chars_1[c-'a']++;
        char[] chars = s2.toCharArray();
        int left=0,right=0;
        while(right<s2.length()){
            //增大窗口
            chars_2[chars[right]-'a']++;
            right++;
            //缩小窗口
            while((right-left) == s1.length()){
                if(Arrays.equals(chars_1,chars_2)){
                    return true;
                }
                chars_2[chars[left]-'a']--;
                left++;
            }
        }
        return false;
    }
}
// @lc code=end

