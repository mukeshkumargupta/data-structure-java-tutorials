package com.interview.tree;

/**
 * Date 10/06/2017
 * @author Mukesh Kumar Gupta
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * Time complexity O(logn)
 *
 * Reference
 * https://leetcode.com/problems/balanced-binary-tree/
 * Must Know
 */
public class HeightBalanced {
    public boolean isBalanced(Node root) {
        return isBalancedUtil(root) >= 0;
    }

    private int isBalancedUtil(Node root) {
        if (root == null) {
            return 0;
        }
        int left = isBalancedUtil(root.left);
        if (left < 0) {  //Not clear
            return -1;
        }
        int right = isBalancedUtil(root.right);
        if (right < 0) {  //Not clear
            return -1;
        }
        int diff = Math.abs(left - right);
        return diff <= 1 ? (Math.max(left, right) + 1) : -1;
    }
    
    
    ////////////////////////////////////////////////
    //Implemented
    //Mine version: Solution submitted https://leetcode.com/problems/balanced-binary-tree/
    private int height(Node root) {
        if (root == null) return 0;
        
        return (1+ Math.max(height(root.left), height(root.right)));
    }
    public boolean isBalanced_V1(Node root) {
        if (root == null) return true;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = leftHeight > rightHeight ? leftHeight - rightHeight : rightHeight - leftHeight;
        if (diff <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;  
        } else {    
            return false;
        }
    }
    public static void main(String[] args ) {
    	//Create tree
    	
    }
}
