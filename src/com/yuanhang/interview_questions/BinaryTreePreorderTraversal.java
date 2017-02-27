package com.yuanhang.interview_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].
 * */

/*
 * 中左右
 * */

public class BinaryTreePreorderTraversal {
	public List<Integer> binaryTreePreorderTraversal( TreeNode root ){
		List<Integer> result = new ArrayList<Integer>();
		return preorder_Recursion(root, result);
	}
	
	/**
	 * 用recursion方法
	 * */
	private List<Integer> preorder_Recursion( TreeNode root, List<Integer> result){
		if(root == null){
			return result;
		}
		TreeNode cur = root;
		result.add(cur.val);
		preorder_Recursion(root.left, result);
		preorder_Recursion(root.right, result);		
		return result; 
	}
	
	
	/**
	 * 用Iteration方法
	 * */
	
	public List<Integer> preorder_Iteration(TreeNode root, List<Integer> result) {
        
       // List<Integer> result = new ArrayList<Integer>();

        if(root == null){
            return result;
        }
        
      
        Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;	
		
		
		stack.push(current);
		
		while( !stack.empty() ){
			current = stack.pop();
			result.add(current.val);
			
			if( current.right != null ){
				stack.push(current.right);
			}

			if( current.left != null ){
				stack.push(current.left);
			}
		}

	return result;
}
	
	
	
	
}
