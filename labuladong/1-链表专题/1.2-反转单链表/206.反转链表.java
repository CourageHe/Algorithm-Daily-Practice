/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    //递归实现
    // 1->2->3->4->5
    //1[head] -> reverse(2->3->4->5[last])
    //1[head] -> (2<-3<-4<-5[last])
    //head.next.next = head(2->1);head.next = null(1->null);
    //null<-1[head] <- (2<-3<-4<-5[last])

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // public ListNode reverseList(ListNode head) {
    //     ListNode dummy = new ListNode();
    //     ListNode p = head;
    //     while(p != null){
    //         ListNode temp = p.next;
    //         p.next = dummy.next;
    //         dummy.next = p; 
    //         p=temp;
    //     }
    //     return dummy.next;
    // }
}
// @lc code=end

