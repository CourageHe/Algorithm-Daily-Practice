/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    //相向指针,利用数组有序的特点
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        while(l<r){
            int val = numbers[l]+ numbers[r];
            if(val == target) return new int[]{l+1,r+1};
            else if(val > target) r--; //两数之和大于target时，r向右移减小两数之和
            else l++; //两数之和小于target时，l向左移增大两数之和
        }
        return null;
    }
}
// @lc code=end

