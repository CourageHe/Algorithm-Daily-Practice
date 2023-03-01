/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        int[] chars_1 = new int[256];
        int[] chars_2 = new int[256];
        for(char c : t.toCharArray()) chars_2[c]++;
        int left = 0,right =0,min = Integer.MAX_VALUE,indexs[] = new int[2];
        char[] chars = s.toCharArray();
        while(right < s.length()){
            chars_1[chars[right]]++;
            right++;
            while((right - left) >= t.length() && isValid(chars_1,chars_2)){
                if(min > (right - left)){
                    min =  right-left;
                    indexs[0] = left;
                    indexs[1] = right;
                }
                chars_1[chars[left]]--;
                left++;                                 
            }
        }   
        if(min != Integer.MAX_VALUE) return s.substring(indexs[0],indexs[1]);
        else return "";
    }
    public boolean isValid(int[] chars_1,int[] chars_2){
        for(int i = 0;i<chars_1.length;i++){
            if(chars_2[i] >0 && chars_1[i] < chars_2[i] ){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

