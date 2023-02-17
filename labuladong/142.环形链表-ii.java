/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
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
    public ListNode detectCycle(ListNode head) {
        //快慢指针初始化，指向head
        ListNode fast = head,slow = head;
        //快指针走到末尾时即停止
        while(fast != null && fast.next != null){
            //慢指针每走一步，快指针走两步
            fast = fast.next.next;
            slow = slow.next;
            //快慢指针相遇，代表有环
            if(slow == fast) {
                break;
            }
        }
        //有环则返回 null
        if(fast == null || fast.next == null) return null;

        //无环，则fast指向head指针
        fast = head;
        //快慢指针同步走，相交节点为环起点
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
// @lc code=end

