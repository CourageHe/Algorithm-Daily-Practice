/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy,last =dummy;
        for(int i = 0;i<n;i++){
            last = last.next;
        }
        while(last.next != null){
            last = last.next;
            prev = prev.next;
        }
        //删除倒数第K个节点
        prev.next = prev.next.next;
        return dummy.next;

    }
}
// @lc code=end

