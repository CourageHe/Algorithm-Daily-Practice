/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    //快慢指针
    public ListNode middleNode(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast.next!= null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null) return slow;
        else return slow.next;
    }
}
// @lc code=end

