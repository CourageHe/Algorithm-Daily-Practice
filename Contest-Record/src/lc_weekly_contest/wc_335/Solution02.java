package lc_weekly_contest.wc_335;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description: 第329场周赛 6308. 二叉树中的第 K 大层和 https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/
 * @Author: CourageHe
 * @Date: 2023/3/5 11:05
 */
public class Solution02 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Long sum = 0l;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum = sum + (long) node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            pq.add(sum);
        }
        if (pq.size() < k) return -1;
        long ans = 0l;
        int size = pq.size();
        for (int i = 0; i <= size - k; i++) {
            ans = pq.poll();
        }
        return ans;

    }

    public static void main(String[] args) {
        // int ans = new Solution02().kthLargestLevelSum(9,4);
        // System.out.println(ans);
    }
}
