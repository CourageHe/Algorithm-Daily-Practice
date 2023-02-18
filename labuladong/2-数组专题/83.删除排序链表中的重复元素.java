/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //链表操作
        ListNode pointer = head;
        while(pointer.next !=null){
            if(pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
            }else{
                pointer = pointer.next;
            }
        }
        return head; 
    }
}
// @lc code=end

