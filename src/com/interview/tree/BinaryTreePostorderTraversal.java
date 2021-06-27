package com.interview.tree;

/*
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Category: Easy
 */
public class BinaryTreePostorderTraversal {
    List<Integer> result = new ArrayList<>();
    private void postorderTraversalUtil(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversalUtil(root.left);
        postorderTraversalUtil(root.right);
        result.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        postorderTraversalUtil(root);
        return result;
        
    }
}
