package com.couragehe.offer07;

/**
 * @PackageName: com.couragehe.offer06
 * @ClassName: Solution01
 * @Description: 剑指 Offer 07. 重建二叉树 https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/10 23:58
 */

public class Solution01 {
    class TreeNode {
        TreeNode left, right;
        Integer val;

        TreeNode(Integer x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        return buildRecursion(preorder, inorder, 0, 0, preorder.length - 1);
    }

    public TreeNode buildRecursion(int[] preorder, int[] inorder, int index, int l, int r) {
        int rootVal = preorder[index];//根节点值
        int index2 = 0;
        for (; rootVal != inorder[index2]; index2++) ;
        TreeNode root = new TreeNode(inorder[index2]);
        TreeNode left = null, right = null;
        if (index2 > l)
            left = buildRecursion(preorder, inorder, index + 1, l, index2 - 1);
        if (index2 < r)
            right = buildRecursion(preorder, inorder, index + (index2 - l) + 1, index2 + 1, r);
        root.left = left;
        root.right = right;
        return root;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
//        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode buildTree = (new Solution01()).buildTree(preorder, inorder);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
