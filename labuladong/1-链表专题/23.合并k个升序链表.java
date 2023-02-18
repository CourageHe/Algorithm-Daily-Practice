/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode pointer = dummy;
        //优先级队列,最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode node : lists){
            if(node == null) continue;
            pq.add(node);
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            pointer.next = node;
            pointer = pointer.next;
            if(node.next != null) pq.add(node.next);
        }
        return dummy.next;
    }
}
// @lc code=end

