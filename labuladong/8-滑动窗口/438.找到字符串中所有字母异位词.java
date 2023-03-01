/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] char_1 = new int[26]; 
        int[] char_2 = new int[26];
        for(char c : p.toCharArray()) char_1[c-'a']++; 
        int left = 0 ,right = 0;
        while(right<s.length()){
            char_2[s.charAt(right)-'a']++;
            right++;
            while(right-left == p.length()){
                if( Arrays.equals(char_1,char_2)){
                    ans.add(left);
                }
                char_2[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
    }
}
// @lc code=end

