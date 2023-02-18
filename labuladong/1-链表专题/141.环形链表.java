/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //快慢指针初始化，指向head
        ListNode slow =head,fast = head;
        //快指针走到末尾时即停止
        while(fast != null && fast.next != null){
            //慢指针每走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
            //快慢指针相遇
            if(slow == fast) return true;
        }
        //不包括换
        return false;
    }
}
// @lc code=end

