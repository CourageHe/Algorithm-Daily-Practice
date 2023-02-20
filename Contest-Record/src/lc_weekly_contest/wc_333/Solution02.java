package lc_weekly_contest.wc_333;

/**
 * @Description: https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/
 * @Author: CourageHe
 * @Date: 2023/02/19 10:05
 */
class Solution02 {

    public int minOperations(int n) {
        int ans = 0;
        String binary = Integer.toBinaryString(n);
        // System.out.println(binary);
        StringBuilder builder = new StringBuilder(binary);
        int len = binary.length();
        int i =len-1,j=len-1;
        while(i>=0){
            if(builder.charAt(i) == '0' && i==j){
                i--;
                j--;
            }else if(builder.charAt(i) == '1'){
                i--;
            }else if(builder.charAt(i) == '0' && i<j){
                if(j-i>1){
                    builder.replace(i,i,"1");;
                    ans++;
                    j=i;
                }else if(j-i == 1){
                    ans++;
                    j=i;
                }
            }else{
                i--;
            }
        }

        if(j-i>1){
            ans+=2;
        }else if(j-i>0){
            ans+=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int n = 39;//3
        // int n = 38;//3
        // int n = 54;//3
        // int n = 27;//3
        int n = 15;//2
        int ans = (new Solution02()).minOperations(n);
        System.out.println(ans);
    }
}
