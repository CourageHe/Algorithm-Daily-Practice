/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //广度优先遍历-计算图（树）节点之间的最短距离
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int depth = 1;
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0;i < sz;i++){
                TreeNode cur= q.poll();
                if(cur.left == null && cur.right == null) return depth;
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }
}
// @lc code=end

