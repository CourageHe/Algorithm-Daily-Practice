/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    int[] ans = new int[2];
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        //数组有序，使用二分查找可快速定位
        for(int i = 0;i<numbers.length;i++){
            int state = binarySearch(numbers,l,r,target-numbers[i]);
            ans[0]++;
            if(state != -1){
                ans[1] = state+1;
                return ans;
            }
        }
        return ans;
    }
    //二分查找改造
    public int binarySearch(int[] numbers,int l,int r,int target){
        while(l<=r){
            int mid = (r-l)/2+l;
            //不可以使用重复元素
            if(numbers[mid] == target && mid != ans[0]) return mid;
            else if(numbers[mid] < target){
                r= mid-1;
            }else if(numbers[mid] >= target){
                //当target值重复时（如[4，4]），取第二个
                l=mid+1;
            }
        }
        return -1;
    }
}
// @lc code=end

