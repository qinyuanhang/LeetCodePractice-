package com.yuanhang.interview_questions;

import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinarySearchTreeIterator {

	private TreeNode cur; 
	private Stack<TreeNode> stack; 

    public BinarySearchTreeIterator(TreeNode root) {
        cur = root;
        stack = new Stack<TreeNode>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(stack.empty() && cur == null);
    }

    /** @return the next smallest number */
    public int next() {
    	while(cur != null){
    		stack.push(cur);
    		cur = cur.left;
    	}

    	cur = stack.pop();
    	int temp = cur.val;
    	cur = cur.right;
    	return temp;	        
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
