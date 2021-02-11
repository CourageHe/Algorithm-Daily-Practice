package com.couragehe.offer06;

import com.couragehe.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @PackageName: com.couragehe.offer06
 * @ClassName: Solution02
 * @Description: 剑指 Offer 06. 从尾到头打印链表 https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/11 0:13
 */

public class Solution02 {

    List<Integer> list= new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        //使用递归完成反转
        ListNode pNode = head;
        reverseRecursion(pNode);
        int[]ans = new int[list.size()];
        for(int i =0;i<ans.length;i++)
            ans[i]=list.get(i);
        return ans;
    }
    private void reverseRecursion(ListNode pNode){
        if(pNode == null)
            return ;
        reverseRecursion(pNode.next);
        list.add(pNode.val);
        return ;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = new int[]{1, 3, 2};
        ListNode head = new ListNode(arr);
        int[] ans = (new Solution02()).reversePrint(head);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
