/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0;i<s.length();i++){
            //以s[i]为中心的回文子串(奇数)
            String oddStr = palindrome(s,i,i);
            //以s[i]为中心的回文子串(偶数)
            String evenStr = palindrome(s,i,i+1);
            ans = ans.length() > oddStr.length()? ans :oddStr;
            ans = ans.length() > evenStr.length()? ans :evenStr;
        }
        return ans;
    }
    //获取[l,r]之间的回文子串
    public String palindrome(String s,int l,int r) {
        while(r<s.length() && l >= 0 && s.charAt(l) == s.charAt(r) ){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
// @lc code=end

